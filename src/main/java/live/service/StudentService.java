package live.service;

import live.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:41
 */
public interface StudentService {

    List<Student> getStudents();

    List<Student> getByName(String name);

    List<Student> getByNameAndSex(String name, String sex);
}
