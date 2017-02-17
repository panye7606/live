package live.dao;

import live.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:39
 */

@Repository
public interface StudentDAO {

    List<Student> getStudents();

    List<Student> getByName(@Param("name") String name);

    List<Student> getByNameAndSex(@Param("name") String name, @Param("sex") String sex);
}
