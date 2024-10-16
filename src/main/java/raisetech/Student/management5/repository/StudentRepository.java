package raisetech.Student.management5.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.Student.management5.data.Student;
import raisetech.Student.management5.data.Students_Courses;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM students ")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<Students_Courses> searchCourse();
}

