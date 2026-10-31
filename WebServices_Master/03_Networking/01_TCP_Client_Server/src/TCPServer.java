import java.net.*;
import java.io.*;
public class TCPServer {
 public static void main(String[] args) throws Exception {
  try (ServerSocket server = new ServerSocket(5000)) {
   System.out.println("TCP server waiting on port 5000");
   while (true) {
    Socket s = server.accept();
    new Thread(() -> {
     try (s; BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
          PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {
      String msg = in.readLine();
      System.out.println("Client: "+msg);
      out.println("Server received: "+msg);
     } catch (IOException e) { System.out.println(e.getMessage()); }
    }).start();
   }
  }
 }
}
