package cn.gtmap.socket.accept_string;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 收发字符串
 * @author Administrator
 *
 */
public class Server {
	public static void main(String[] args) {
		
		try {
			//服务端开启8888端口，并监听着，时刻等待着客户端的连接请求 
			ServerSocket ss = new ServerSocket(8888);
			
			//在8888端口上监听，看是否有连接请求过来
			System.out.println("监听在端口号：8888");
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			
			//把输入流封装在DataInputStream
			DataInputStream dis = new DataInputStream(is);
			
			//使用readUTF读取字符串
			String msg = dis.readUTF();
			System.out.println(msg);
			
			dis.close();
			s.close();
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
