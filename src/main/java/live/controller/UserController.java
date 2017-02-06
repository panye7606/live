package live.controller;

import live.model.User;
import live.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by rcer on 17/1/29.
 */

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        List<User> users = userService.getUsers();
        return "hello";
    }

}
