package org.example;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;
public class Client {
 public static void main(String[] args) throws Exception {
  URL wsdl=new URL("http://localhost:8080/temperature?wsdl");
  QName qname=new QName("http://example.org/","TemperatureImplService");
  Service service=Service.create(wsdl,qname);
  Temperature t=service.getPort(Temperature.class);
  System.out.println("100 C = "+t.celsiusToFahrenheit(100)+" F");
 }
}
