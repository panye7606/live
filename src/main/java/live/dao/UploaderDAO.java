package live.dao;

import live.model.Uploader;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author rcer
 * @Date 17/2/23 下午1:54
 */
@Repository
public interface UploaderDAO {

    boolean add(Uploader uploader);
}
