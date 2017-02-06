package live.service.Impl;

import live.dao.LiveDao;
import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rcer on 17/2/3.
 */

@Service
public class LiveServiceImpl implements LiveService {

    @Autowired
    private LiveDao liveDao;

    public List<Live> getLives() {
        List<Live> lives = liveDao.getLives();
        return lives;
    }

}
