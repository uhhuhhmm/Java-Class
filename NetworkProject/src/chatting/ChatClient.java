package chatting;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chatting.ChatServer.Receiver;

public class ChatClient extends JFrame implements ActionListener {

	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Receiver receiver;
	JTextField sender; 
	
	public ChatClient() {
		setTitle("Client Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		sender = new JTextField();
		
		sender.addActionListener(this);
		
		add(new JScrollPane(receiver), BorderLayout.CENTER);
		add(sender, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
		
		try {
			setupConnection();
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		Thread th = new Thread(receiver);
		th.start();
	}
	
	void setupConnection() throws IOException{
		socket = new Socket("192.168.0.74", 7777);
		receiver.append("Server Connection Completed");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	
	}
	
	class Receiver extends JTextArea implements Runnable{

		@Override
		public void run() {
			String msg = null;
			while(true) {	
				try {
					msg = in.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.append("\nServer : " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
				
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sender) {
			String msg = sender.getText();
			try {
				out.write(msg + "\n");
				out.flush();
				receiver.append("\n Client : " + msg);
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos);
				sender.setText(null);
				
			}catch(IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}

	public static void main(String[] args) {
		new ChatClient();
		
	}

}
