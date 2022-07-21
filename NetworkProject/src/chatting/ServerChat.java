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
			System.out.println("연결을 기다리는중");
			socket = listener.accept();
			System.out.println("연결됐습니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 종료");
					break;	//서버도 break로 반복문 끝
				}
				
				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("보내기 >> ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();	//버퍼들은 꼭 flush
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류 발생");
			}
		}
		
		
	
	}
	
	
	
}
