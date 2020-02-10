package cn.gtmap.socket.scanner;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ���ϸ������У�ÿ��Ҫ����ͬ�����ݶ���Ҫ�޸Ĵ��� 
 * ����ʹ��Scanner��ȡ����̨�����룬�����͵�����ˣ�����ÿ�ζ����Է��Ͳ�ͬ�������ˡ�
 *
 */
public class Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",8888);
			
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			//ʹ��Scanner��ȡ����̨�����룬�����͵������
			Scanner sc = new Scanner(System.in);
			
			String str = sc.next();
			dos.writeUTF(str);
			
			dos.close();
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