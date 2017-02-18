package live.controller;

import live.model.Student;
import live.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
/**
 * @Author rcer
 * @Date 17/2/18 下午1:38
 */
@Controller
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv, @RequestParam(value = "name1", required = false) String name, @RequestParam(value = "sex1", required = false) String sex) {
        List<Student> students = studentService.getByNameAndSex(name, sex);
        mv.addObject("list", students);
        mv.setViewName("student/index");
        return mv;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index1(ModelAndView mv, String name, String sex) {
        List<Student> students = studentService.getByNameAndSex(name, sex);
        mv.addObject("list", students);
        mv.setViewName("student/index");
        return mv;
    }

}
