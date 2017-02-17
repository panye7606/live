package live.service.Impl;

import live.dao.StudentDAO;
import live.model.Student;
import live.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:41
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getStudents() {
        List<Student> students = studentDAO.getStudents();
        return students;
    }

    public List<Student> getByName(String name) {
        List<Student> students = studentDAO.getByName(name);
        return students;
    }

    public List<Student> getByNameAndSex(String name, String sex) {
        List<Student> students = studentDAO.getByNameAndSex(name, sex);
        return students;
    }
}
