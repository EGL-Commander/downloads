import java.net.*;
public class UDPClient {
 public static void main(String[] args) throws Exception {
  try (DatagramSocket socket = new DatagramSocket()) {
   byte[] data = "Hello UDP server".getBytes();
   socket.send(new DatagramPacket(data,data.length,InetAddress.getByName("localhost"),5001));
   byte[] buf = new byte[1024];
   DatagramPacket response = new DatagramPacket(buf,buf.length);
   socket.receive(response);
   System.out.println(new String(response.getData(),0,response.getLength()));
  }
 }
}
