package live.service;

import live.model.Live;
import java.util.List;

public interface LiveService {

    List<Live> getLives();

    boolean add(Live live);

    Live getById(int id);

    boolean update(Live live);

    boolean delete(int id);
}
