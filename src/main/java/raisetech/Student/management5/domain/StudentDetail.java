package raisetech.Student.management5.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import raisetech.Student.management5.data.Student;
import raisetech.Student.management5.data.Students_Courses;

@Getter
@Setter
public class StudentDetail {

  private Student student;
  private List<Students_Courses> students_courses;

}
