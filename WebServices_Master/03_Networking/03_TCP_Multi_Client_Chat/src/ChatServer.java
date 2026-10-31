import java.net.*;
import java.io.*;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServer {
 static Set<PrintWriter> clients = ConcurrentHashMap.newKeySet();
 public static void main(String[] args) throws Exception {
  try (ServerSocket server = new ServerSocket(5002)) {
   System.out.println("Chat server on 5002");
   while (true) {
    Socket socket = server.accept();
    new Thread(() -> handle(socket)).start();
   }
  }
 }
 static void handle(Socket socket) {
  PrintWriter out = null;
  try (socket;
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
   out = new PrintWriter(socket.getOutputStream(),true);
   clients.add(out);
   out.println("Connected. Enter /quit to leave.");
   String msg;
   while ((msg=in.readLine())!=null && !msg.equalsIgnoreCase("/quit")) {
    System.out.println(msg);
    for (PrintWriter client: clients) client.println(msg);
   }
  } catch (IOException e) { System.out.println("Client disconnected."); }
  finally { if (out!=null) clients.remove(out); }
 }
}
