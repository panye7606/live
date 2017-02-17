package live.test;

import live.model.Student;
import live.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:48
 */
public class StudentTest extends BaseTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void getStudents() {
        List<Student> students = studentService.getStudents();
        for (Student s : students) {
            System.out.println(s.toString());
            System.out.println(s.getClazz().toString());
        }
    }

    @Test
    public void getByName() {
        List<Student> students = studentService.getByName("rose");
        for (Student s : students) {
            System.out.println("=========" + s.toString() + "=============");
        }
    }

    @Test
    public void getByNameAndSex() {
        List<Student> students = studentService.getByNameAndSex("", "女");
        for (Student s : students) {
            System.out.println("=========" + s.toString() + "=============");
        }

        students = studentService.getByNameAndSex("rose", "");
        for (Student s : students) {
            System.out.println("=========" + s.toString() + "=============");
        }

        students = studentService.getByNameAndSex("rose", "女");
        for (Student s : students) {
            System.out.println("=========" + s.toString() + "=============");
        }
    }

}
