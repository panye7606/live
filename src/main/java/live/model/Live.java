package live.model;

import java.io.Serializable;

/**
 * Created by rcer on 17/2/3.
 */
public class Live implements Serializable {

    private int id;

    private String platform;

    private String anchor;

    private String url;

    private String imgUrl;

    private Integer num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Live{" +
                "id=" + id +
                ", platform='" + platform + '\'' +
                ", anchor='" + anchor + '\'' +
                ", url='" + url + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", num=" + num +
                '}';
    }
}
