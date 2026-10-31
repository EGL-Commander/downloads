import java.io.FileInputStream;
import javax.xml.stream.*;

public class ReadWithStAX {
 public static void main(String[] args) throws Exception {
  XMLStreamReader r = XMLInputFactory.newInstance().createXMLStreamReader(new FileInputStream("university.xml"));
  String id = "";
  while (r.hasNext()) {
   int event = r.next();
   if (event == XMLStreamConstants.START_ELEMENT && r.getLocalName().equals("student")) id = r.getAttributeValue(null,"id");
   if (event == XMLStreamConstants.START_ELEMENT && r.getLocalName().equals("major")) {
    System.out.println(id+" -> "+r.getElementText());
   }
  }
  r.close();
 }
}
