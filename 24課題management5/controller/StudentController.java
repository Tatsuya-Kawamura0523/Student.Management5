package raisetech.Student.management5.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.management5.data.Student;
import raisetech.Student.management5.data.Students_Courses;
import raisetech.Student.management5.service.StudentService;


@RestController
public class StudentController {

  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return service.searchStudentList();

  }

  @GetMapping("/studentCourseList")
  public List<Students_Courses> getStudentCourse() {
    return service.searchStudentCourseList();

  }
}
