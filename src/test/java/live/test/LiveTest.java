package live.test;

import live.model.Live;
import live.service.LiveService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/9 下午5:37
 */
public class LiveTest extends BaseTest {

    @Autowired
    private LiveService liveService;

    @Test
    public void test() {
        List<Live> lives = liveService.getLives();
        System.out.println(lives.size());
    }
}

