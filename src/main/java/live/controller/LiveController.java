package live.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rcer on 17/1/29.
 */

@Controller
@RequestMapping("/welcome")
public class LiveController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
