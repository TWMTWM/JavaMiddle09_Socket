package cn.gtmap.socket_accept_number;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * һ�����������ӣ�����˺Ϳͻ��˾Ϳ���ͨ��Socket����ͨ���� 
 * 	1. �ͻ��˴������������������ 110 
 * 	2. ����˴����������������� 110������ӡ
 *
 */
public class Client {
	public static void main(String[] args) {
		//���ӵ�������8888�˿�
		try {
			Socket s =new Socket("127.0.0.1",8888);
			//�������
			OutputStream os = s.getOutputStream();
			
			//��������110�������
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
