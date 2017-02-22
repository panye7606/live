package live.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author rcer
 * @Date 17/2/23 下午12:49
 */
public class Uploader {

    private Integer id;

    private String description;

    private String fileName;

    private String filePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

