import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class ReadXML {
 public static void main(String[] args) throws Exception {
  DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
  Document doc = builder.parse(new File("students.xml"));
  NodeList list = doc.getElementsByTagName("Student");
  for (int i=0; i<list.getLength(); i++) {
   Element s = (Element) list.item(i);
   System.out.println(s.getElementsByTagName("ID").item(0).getTextContent()+" "
    +s.getElementsByTagName("Name").item(0).getTextContent()+" "
    +s.getElementsByTagName("Department").item(0).getTextContent());
  }
 }
}
