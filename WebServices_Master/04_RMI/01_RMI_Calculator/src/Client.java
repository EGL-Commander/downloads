import java.rmi.Naming;
public class Client {
 public static void main(String[] args) throws Exception {
  Calculator c=(Calculator)Naming.lookup("rmi://localhost/Calculator");
  System.out.println("Sum: "+c.add(20,30));
 }
}
