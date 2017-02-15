package live.service.Impl;

import live.dao.LiveDAO;
import live.model.Live;
import live.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveServiceImpl implements LiveService {

    @Autowired
    private LiveDAO liveDAO;

    public List<Live> getLives() {
        List<Live> lives = liveDAO.getLives();
        return lives;
    }

    public boolean add(Live live) {
        return liveDAO.add(live);
    }

    public Live getById(int id) {
        Live live = liveDAO.getById(id);
        return live;
    }

    public boolean update(Live live) {
        boolean result = liveDAO.update(live);
        return result;
    }

    public boolean delete(int id) {
        boolean result = liveDAO.delete(id);
        return result;
    }

}
