package org.example;
import jakarta.jws.*;
@WebService
public class StudentService {
 @WebMethod
 public String getStudent(int id) {
  if(id==101) return "ID: 101, Name: Rahul, Course: MSc IT";
  if(id==102) return "ID: 102, Name: Amit, Course: BCA";
  return "Student not found";
 }
}
