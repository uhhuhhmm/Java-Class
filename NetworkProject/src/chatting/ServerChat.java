package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(7777);
			System.out.println("������ ��ٸ�����");
			socket = listener.accept();
			System.out.println("����ƽ��ϴ�");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ����");
					break;	//������ break�� �ݺ��� ��
				}
				
				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.print("������ >> ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();	//���۵��� �� flush
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�");
			}
		}
		
		
	
	}
	
	
	
}
