package org.example;
import java.nio.file.*;
import org.json.*;

public class XMLtoJSON {
 public static void main(String[] args) throws Exception {
  String xml = Files.readString(Path.of("data.xml"));
  JSONObject json = XML.toJSONObject(xml);
  System.out.println(json.toString(4));
 }
}
