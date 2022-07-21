package networkproject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		// 0 ~ 1023번 : 잘 알려진 포트 (well-known port)
		// 65535
		
		ServerSocket serverSocket = null; // Client 요청 감지
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비 됐습니다");
			
			Socket socket = serverSocket.accept();
			System.out.println(getTime() + socket.getInetAddress() + "로부터 연결 요청 확인");
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("[Notice] Test Message1 from Server");
			System.out.println(getTime() + "데이터 전송했습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
