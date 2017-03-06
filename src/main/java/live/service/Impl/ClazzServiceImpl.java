package live.service.Impl;

import live.dao.ClazzDAO;
import live.model.Clazz;
import live.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:57
 */
@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzDAO clazzDAO;

    @Transactional(readOnly = true)
    public List<Clazz> getClazzs() {
        List<Clazz> clazzs = clazzDAO.getClazzs();
        return clazzs;
    }
}
