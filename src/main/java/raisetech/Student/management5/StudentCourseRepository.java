package raisetech.Student.management5;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentCourseRepository {

  @Select("SELECT * FROM students_courses")
  List<Students_Courses> searchCourse();

}
