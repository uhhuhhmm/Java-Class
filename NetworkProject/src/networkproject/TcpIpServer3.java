package networkproject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer3 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비 됐습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(getTime() + "연결을 기다립니다");
			
			try {
				serverSocket.setSoTimeout(5000);
				Socket socket = serverSocket.accept();
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Test Message1 from Server");
				System.out.println(getTime() + "데이터 전송했습니다");
				
				dos.close();
				socket.close();
				
			} catch (SocketTimeoutException e) {
				System.out.println("지정된 시간동안 접속요청이 없어 서버를 종료합니다");
				System.exit(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
