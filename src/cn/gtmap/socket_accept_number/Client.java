package cn.gtmap.socket_accept_number;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 一旦建立了连接，服务端和客户端就可以通过Socket进行通信了 
 * 	1. 客户端打开输出流，并发送数字 110 
 * 	2. 服务端打开输入流，接受数字 110，并打印
 *
 */
public class Client {
	public static void main(String[] args) {
		//连接到本机的8888端口
		try {
			Socket s =new Socket("127.0.0.1",8888);
			//打开输出流
			OutputStream os = s.getOutputStream();
			
			//发送数字110到服务端
			os.write(110);
			os.close();
			
			//System.out.println(s);
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
