package org.example;
import java.nio.file.*;
import org.json.*;

public class JSONtoXML {
 public static void main(String[] args) throws Exception {
  JSONObject json = new JSONObject(Files.readString(Path.of("data.json")));
  System.out.println(XML.toString(json, "student"));
 }
}
