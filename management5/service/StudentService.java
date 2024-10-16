package raisetech.Student.management5.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.Student.management5.data.Student;
import raisetech.Student.management5.data.Students_Courses;
import raisetech.Student.management5.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;


  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    //検索処理
    return repository.search().stream()
        .filter(student -> student.getAge() >= 30 && student.getAge() < 40)
        .collect(Collectors.toList());
    //絞り込みをする。年齢が30代の人のみを抽出する。
    //抽出したリストをコントローラーに返す。

  }

  public List<Students_Courses> searchStudentCourseList() {
    //絞り込み検索で「Java」のコース情報のみ抽出する。
    //抽出したリストをコントローラーに返す。
    return repository.searchCourse().stream()
        .filter(studentsCourses -> studentsCourses.getCourseName().equals("JAVA"))
        .collect(Collectors.toUnmodifiableList());
  }
}
