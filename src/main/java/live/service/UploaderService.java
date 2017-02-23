package live.service;

import live.model.Uploader;

import java.util.List;

/**
 * @Author rcer
 * @Date 17/2/23 下午1:54
 */
public interface UploaderService {

    boolean add(Uploader uploader);

    List<Uploader> getUploaders();
}
