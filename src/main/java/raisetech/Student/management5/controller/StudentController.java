package raisetech.Student.management5.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.management5.controller.converter.StudentConverter;
import raisetech.Student.management5.data.Student;
import raisetech.Student.management5.data.Students_Courses;
import raisetech.Student.management5.domain.StudentDetail;
import raisetech.Student.management5.service.StudentService;


@RestController
public class StudentController {

  private StudentService service;
private  StudentConverter converter;

  @Autowired
  public StudentController(StudentService service, StudentConverter converter) {
    this.service = service;
    this.converter=converter;
  }

  @GetMapping("/studentList")
  public List<StudentDetail> getStudentList() {
    List<Student> students = service.searchStudentList();
    List<Students_Courses> studentsCourses = service.searchStudentCourseList();

    return converter.convertStudentDetails(students, studentsCourses);

  }

  @GetMapping("/studentCourseList")
  public List<Students_Courses> getStudentCourse() {
    return service.searchStudentCourseList();

  }
}
