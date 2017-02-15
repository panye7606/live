package live.dao;

import live.model.Clazz;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/15 下午8:55
 */
@Repository
public interface ClazzDAO {

    List<Clazz> getClazzs();

}
