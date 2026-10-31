import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.validation.*;
import javax.xml.transform.stream.StreamSource;

public class ValidateXML {
 public static void main(String[] args) throws Exception {
  SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
  Schema schema = factory.newSchema(new File("employee.xsd"));
  Validator validator = schema.newValidator();
  validator.validate(new StreamSource(new File("employee.xml")));
  System.out.println("XML is valid.");
 }
}
