package live.controller;

import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rcer on 17/1/29.
 */

@Controller
@RequestMapping("/lives")
public class LiveController {

    @Autowired
    private LiveService liveService;

    @RequestMapping("")
    public String index(Model model) {
        List<Live> lives = liveService.getLives();
        model.addAttribute("lives", lives);
        return "live/index";
    }

}
