package live.service;

import live.model.Live;
import java.util.List;

/**
 * Created by rcer on 17/2/3.
 */


public interface LiveService {

    List<Live> getLives();

    boolean add(Live live);
}
