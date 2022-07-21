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

public class ChatServer extends JFrame implements ActionListener {

	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Receiver receiver; //클래스 직접 만듦
	JTextField sender; 
	
	public ChatServer() {
		setTitle("Server Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		sender = new JTextField();	//밑에 부분 글을 입력하는 부분
		
		sender.addActionListener(this);	//enter치는 event
		
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
		listener = new ServerSocket(7777);
		socket = listener.accept();
		receiver.append("Client Connection Completed");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	
	}
	
	class Receiver extends JTextArea implements Runnable{

		@Override
		public void run() {
			String msg = null;
			while(true) {	//클라이언트에서 보낸 내용을 보여준다
				try {
					msg = in.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.append("\nClient : " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
				
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sender) {
			String msg = sender.getText();	//1.client로 보냄 2.
			try {
				out.write(msg + "\n");
				out.flush();
				receiver.append("\n Server : " + msg);
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
		new ChatServer();
		
		
	}

}
