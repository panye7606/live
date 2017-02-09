package live.dao;

import live.model.Live;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LiveDao {

    List<Live> getLives();

    boolean add(Live live);

    Live getById(int id);

    boolean update(Live live);
}
