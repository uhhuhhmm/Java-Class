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
		// 0 ~ 1023�� : �� �˷��� ��Ʈ (well-known port)
		// 65535
		
		ServerSocket serverSocket = null; // Client ��û ����
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "������ �غ� �ƽ��ϴ�");
			
			Socket socket = serverSocket.accept();
			System.out.println(getTime() + socket.getInetAddress() + "�κ��� ���� ��û Ȯ��");
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("[Notice] Test Message1 from Server");
			System.out.println(getTime() + "������ �����߽��ϴ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
