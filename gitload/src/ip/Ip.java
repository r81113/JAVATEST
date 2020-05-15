package ip;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ip {

	public static void main(String[] args) throws SocketException, Exception {
		// TODO Auto-generated method stub
		
		  InetAddress ip = InetAddress.getLocalHost();  
		  
//	       System.out.println("Current IP address : " + ip.getHostAddress());  
//	       // Current IP address : 192.168.0.109  
//	  
//	       System.out.println(ip.getCanonicalHostName());  
//	       // 192.168.0.109  
//	  
//	       System.out.println(ip.getHostName());  
//	       // jaxhu-PC  
	  
	  
	  
	       NetworkInterface network = NetworkInterface.getByInetAddress(ip);  
	  
	       byte[] mac = network.getHardwareAddress();  
	  
	       StringBuilder sb = new StringBuilder();  
	       
	       for (int i = 0; i < mac.length; i++) {  
	           sb.append(String.format("%s%02X", (i > 0 ? "-" : ""), mac[i]));  
	       }  
	   
//	       System.out.println("Current MAC address : " + sb.toString());  
//	       // Current MAC address : 38-2C-4A-B4-C3-24  
//	  
//	       System.out.println(network.getDisplayName());  
//	       // Realtek PCIe GBE Family Controller  
//	  
//	       System.out.println(network.getName());  
//	       // eth3  
	       
	       String a = "Current IP address : " + ip.getHostAddress()+"\n";
	       
	       a+=ip.getCanonicalHostName()+"\n";
	       
	       a+=ip.getHostName()+"\n";
	       
	       a+="Current MAC address : " + sb.toString()+"\n";
	       
	       a+=network.getDisplayName()+"\n";
	       
	       a+=network.getName()+"\n";
	      
	       
	       JOptionPane.showMessageDialog(null
	        		,a
	        		,"IP"
	        		,1
	        		,null
	        );
	       
	}

}
