package org.example;
import jakarta.xml.ws.Endpoint;
public class StudentServer {
 public static void main(String[] args) {
  Endpoint.publish("http://localhost:8081/students",new StudentService());
  System.out.println("Student SOAP service started at http://localhost:8081/students?wsdl");
 }
}
