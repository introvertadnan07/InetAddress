import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressExample {
 public static void main(String[] args) {
 try {
 // Get the local host address
 InetAddress localHost = InetAddress.getLocalHost();
 System.out.println("Local Host:");
 System.out.println("Hostname: " + localHost.getHostName());
 System.out.println("IP Address: " + localHost.getHostAddress());
 System.out.println();
 // Get the IP address from a hostname
 String hostname = "www.example.com";
 InetAddress hostAddress = InetAddress.getByName(hostname);
 System.out.println("Host Information for: " + hostname);
 System.out.println("Hostname: " + hostAddress.getHostName());
 System.out.println("IP Address: " + hostAddress.getHostAddress());
 System.out.println();
 // Get the hostname from an IP address
 String ipAddress = "93.184.216.34"; // IP address for example.com
 InetAddress addressByIP = InetAddress.getByName(ipAddress);
 System.out.println("Host Information for IP: " + ipAddress);
 System.out.println("Hostname: " + addressByIP.getHostName());
 System.out.println("IP Address: " + addressByIP.getHostAddress());
 } catch (UnknownHostException e) {
 System.out.println("Unknown host: " + e.getMessage());
 }
 }
}