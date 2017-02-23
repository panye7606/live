package live.service.Impl;

import live.dao.UploaderDAO;
import live.model.Uploader;
import live.service.UploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/23 下午1:55
 */
@Service
public class UploaderServiceImpl implements UploaderService {

    @Autowired
    private UploaderDAO uploaderDAO;

    public boolean add(Uploader uploader) {
        boolean result = uploaderDAO.add(uploader);
        return result;
    }

    public List<Uploader> getUploaders() {
        List<Uploader> uploaderList = uploaderDAO.getUploaders();
        return uploaderList;
    }

}
