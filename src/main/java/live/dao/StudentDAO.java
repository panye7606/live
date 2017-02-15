package live.dao;

import live.model.Student;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:39
 */

@Repository
public interface StudentDAO {

    List<Student> getStudents();

}
