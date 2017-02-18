package live.controller;

import live.model.Clazz;
import live.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/18 下午1:17
 */
@Controller
@RequestMapping(value = "/clazzs")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        List<Clazz> clazzs = clazzService.getClazzs();
        modelMap.addAttribute("list", clazzs);
        return "clazz/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) {
        List<Clazz> clazzs = clazzService.getClazzs();
        mv.addObject("list", clazzs);
        mv.setViewName("clazz/index");
        return mv;
    }

}
