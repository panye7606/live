package live.dao;

import live.model.Live;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by rcer on 17/2/3.
 */

@Repository
public interface LiveDao {

    List<Live> getLives();

    boolean add(Live live);
}
