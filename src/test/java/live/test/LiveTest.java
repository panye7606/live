package live.test;

import live.model.Live;
import live.service.LiveService;
import org.apache.ibatis.session.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/9 下午5:37
 */
public class LiveTest extends BaseTest {

    @Autowired
    private LiveService liveService;

    @Autowired
    private SqlSessionFactory factory;

    @Test
    public void getLives() {
        List<Live> lives = liveService.getLives();
        System.out.println(lives.size());
    }

    @Test
    public void deleteLive() {
        boolean result = liveService.delete(5);
        System.out.println(result);
    }

    @Test
    public void getById() {
        SqlSession session = factory.openSession();
        Live live = session.selectOne("live.dao.LiveDAO.getById", 1);
        session.close();
        System.out.println(live.toString());
    }
}

