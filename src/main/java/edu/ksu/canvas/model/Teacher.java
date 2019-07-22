package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;

@CanvasObject(postKey = "teacher")
public class Teacher extends BaseCanvasModel implements Serializable {
    private Integer id;
    private String displayName;
    private String avatarImageUrl;
    private String html_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @CanvasField(postKey="display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    @CanvasField(postKey="avatar_image_url")
    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }
    @CanvasField(postKey="html_url")
    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
