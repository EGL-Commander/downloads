import java.net.*;
import java.io.*;
public class TCPClient {
 public static void main(String[] args) throws Exception {
  try (Socket s = new Socket("localhost",5000);
       PrintWriter out = new PrintWriter(s.getOutputStream(),true);
       BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
   out.println("Hello from client");
   System.out.println(in.readLine());
  }
 }
}
