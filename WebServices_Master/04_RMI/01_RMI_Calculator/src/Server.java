import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
public class Server {
 public static void main(String[] args) throws Exception {
  LocateRegistry.createRegistry(1099);
  Naming.rebind("rmi://localhost/Calculator",new CalculatorImpl());
  System.out.println("RMI server started.");
 }
}
