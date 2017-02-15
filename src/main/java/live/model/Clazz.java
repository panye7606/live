package live.model;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:36
 */
public class Clazz {

    private Integer id;
    private String code;
    private List<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", students=" + students +
                '}';
    }
}
