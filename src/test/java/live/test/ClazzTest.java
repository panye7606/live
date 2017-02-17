package live.test;

import live.model.Clazz;
import live.model.Student;
import live.service.ClazzService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午9:03
 */
public class ClazzTest extends BaseTest {

    @Autowired
    private ClazzService clazzService;

    @Test
    public void getClazzs() {
        List<Clazz> clazzs = clazzService.getClazzs();

        for (Clazz c : clazzs) {
            System.out.println(c.toString());
            System.out.println("======= size"+ c.getStudents().size() + "=============");

            List<Student> students = c.getStudents();

            for (Student s : students) {
                System.out.println(s.toString());
            }
        }
    }

}
