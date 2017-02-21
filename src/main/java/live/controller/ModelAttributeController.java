package live.controller;

import live.model.Live;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author rcer
 * @Date 17/2/21 下午9:28
 */
@Controller
@RequestMapping(value = "/model_attribute")
public class ModelAttributeController {

//    @ModelAttribute 不填写value 默认用Live模型的首字母小写字符串
    @ModelAttribute("live")
    public Live getUsername(@RequestParam String platform) {
        Live live = new Live();
        live.setPlatform(platform);
        return live;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "model_attribute/index";
    }

}
