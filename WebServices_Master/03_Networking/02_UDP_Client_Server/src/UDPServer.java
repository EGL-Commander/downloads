import java.net.*;
public class UDPServer {
 public static void main(String[] args) throws Exception {
  try (DatagramSocket socket = new DatagramSocket(5001)) {
   byte[] buf = new byte[1024];
   DatagramPacket request = new DatagramPacket(buf,buf.length);
   System.out.println("UDP server waiting...");
   socket.receive(request);
   String msg = new String(request.getData(),0,request.getLength());
   System.out.println("Client: "+msg);
   byte[] reply = ("Server received: "+msg).getBytes();
   socket.send(new DatagramPacket(reply,reply.length,request.getAddress(),request.getPort()));
  }
 }
}
