package cn.gtmap.socket_accept_number;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. ����˿���8888�˿ڣ��������ţ�ʱ�̵ȴ��ſͻ��˵��������� 
 * 2. �ͻ���֪������˵�ip��ַ�ͼ����˿ںţ��������󵽷���� 
 * 	�ͻ��˵Ķ˿ڵ�ַ��ϵͳ����ģ�ͨ���������1024 
 * 	һ�����������ӣ�����˻�õ�һ���µ�Socket���󣬸ö�������ͻ��˽���ͨ�š� 
 * 	ע�⣺ �ڿ������ԵĹ����У�����޸Ĺ��˷�����Server���룬Ҫ�ر�������Server,�����µ�Server������������Ϊ8888�˿ڱ�ռ����
 * @author Administrator
 *
 */
public class Server {
	public static void main(String[] args) {
		try {
			//����˴򿪶˿�8888
			ServerSocket ss = new ServerSocket(8888);
			
			//��8888�˿��ϼ��������Ƿ��������������
			System.out.println("�����ڶ˿ںţ�8888");
			Socket s = ss.accept();
			//��������
			InputStream is = s.getInputStream();
			//��ȡ�ͻ��˷��͵�����
			int msg = is.read();
			//��ӡ����
			System.out.println(msg);
			//System.out.println("�����ӹ���" + s);
			is.close();
			
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
