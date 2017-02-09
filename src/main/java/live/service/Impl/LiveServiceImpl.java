package live.service.Impl;

import live.dao.LiveDao;
import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveServiceImpl implements LiveService {

    @Autowired
    private LiveDao liveDao;

    public List<Live> getLives() {
        List<Live> lives = liveDao.getLives();
        return lives;
    }

    public boolean add(Live live) {
        return liveDao.add(live);
    }

    public Live getById(int id) {
        Live live = liveDao.getById(id);
        return live;
    }

    public boolean update(Live live) {
        boolean result = liveDao.update(live);
        return result;
    }

    public boolean delete(int id) {
        boolean result = liveDao.delete(id);
        return result;
    }

}
