package live.controller;

import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by rcer on 17/1/29.
 */

@Controller
@RequestMapping(value = "/lives")
public class LiveController {

    @Autowired
    private LiveService liveService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        List<Live> lives = liveService.getLives();
        model.addAttribute("lives", lives);
        return "live/index";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit() {
        return "live/edit";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String create(Live live) {
        liveService.add(live);
        return "redirect:/lives";
    }

}
