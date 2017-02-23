package live.dao;

import live.model.Uploader;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/23 下午1:54
 */
@Repository
public interface UploaderDAO {

    List<Uploader> getUploaders();

    boolean add(Uploader uploader);
}
