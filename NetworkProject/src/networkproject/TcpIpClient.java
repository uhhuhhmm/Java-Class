package networkproject;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
		String serverIp = "192.168.0.74";
		
		System.out.println("서버에 연결 중입니다 서버IP :" + serverIp);
		
		
		try {
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			System.out.println("Client 연결 종료");
			
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
