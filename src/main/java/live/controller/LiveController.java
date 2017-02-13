package live.controller;

import com.alibaba.fastjson.JSONObject;
import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "live/add";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String create(Live live) {
        liveService.add(live);
        return "redirect:/lives";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) {
        Live live = liveService.getById(id);
        model.addAttribute("live", live);
        return "live/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable("id") int id, Live live) {
        liveService.update(live);
        return "redirect:/lives";
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public JSONObject delete(@PathVariable("id") int id) {
        JSONObject rsp = new JSONObject();
        boolean result = liveService.delete(id);
        if (result) {
            rsp.put("status", 0);
        } else {
            rsp.put("status", -1);
        }
        return rsp;
    }

}
