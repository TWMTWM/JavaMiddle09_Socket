package cn.gtmap.ip_port;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("±¾»úipµØÖ·£º" + ip);
	}
}
