import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class OrderAnalysis {
 public static void main(String[] args) throws Exception {
  Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("orders.xml"));
  NodeList orders = doc.getElementsByTagName("order");
  double revenue = 0;
  for (int i=0; i<orders.getLength(); i++) {
   Element order = (Element)orders.item(i);
   if ("Delivered".equals(order.getAttribute("status"))) {
    String customer = order.getElementsByTagName("customer").item(0).getTextContent();
    double price = Double.parseDouble(order.getElementsByTagName("price").item(0).getTextContent());
    System.out.println(order.getAttribute("id")+" "+customer+" "+price);
    revenue += price;
   }
  }
  System.out.println("Total delivered revenue: "+revenue);
 }
}
