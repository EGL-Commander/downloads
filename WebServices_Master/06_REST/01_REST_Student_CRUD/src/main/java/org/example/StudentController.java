package org.example;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;
@RestController
@RequestMapping("/students")
public class StudentController {
 private final Map<Integer,Student> students=new ConcurrentHashMap<>();
 public StudentController(){students.put(1,new Student(1,"Rahul","MSc IT"));students.put(2,new Student(2,"Amit","BCA"));}
 @GetMapping public Collection<Student> all(){return students.values();}
 @GetMapping("/{id}") public Student one(@PathVariable int id){return students.get(id);}
 @PostMapping public Student create(@RequestBody Student s){students.put(s.getId(),s);return s;}
 @PutMapping("/{id}") public Student update(@PathVariable int id,@RequestBody Student s){s.setId(id);students.put(id,s);return s;}
 @DeleteMapping("/{id}") public String delete(@PathVariable int id){return students.remove(id)==null?"Not found":"Deleted";}
}
