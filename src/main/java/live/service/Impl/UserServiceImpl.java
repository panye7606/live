package live.service.Impl;

import live.dao.UserDao;
import live.model.User;
import live.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rcer on 17/2/3.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUsers() {
        List<User> users = userDao.getUsers();
        return users;
    }

    public void test() {
        System.out.println("test.......");
    }

}
