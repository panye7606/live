package live.dao;

import live.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rcer on 17/2/3.
 */

@Repository
public interface UserDao {

    List<User> getUsers();
}
