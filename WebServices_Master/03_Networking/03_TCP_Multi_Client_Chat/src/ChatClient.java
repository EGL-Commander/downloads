import java.net.*;
import java.io.*;
public class ChatClient {
 public static void main(String[] args) throws Exception {
  try (Socket s = new Socket("localhost",5002);
       BufferedReader server = new BufferedReader(new InputStreamReader(s.getInputStream()));
       PrintWriter out = new PrintWriter(s.getOutputStream(),true);
       BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
   Thread reader = new Thread(() -> { try { String line; while ((line=server.readLine())!=null) System.out.println(line); } catch(IOException ignored){} });
   reader.setDaemon(true); reader.start();
   String msg; while ((msg=keyboard.readLine())!=null) { out.println(msg); if(msg.equalsIgnoreCase("/quit")) break; }
  }
 }
}
