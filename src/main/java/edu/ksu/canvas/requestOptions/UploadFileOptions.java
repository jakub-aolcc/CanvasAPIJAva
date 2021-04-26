package edu.ksu.canvas.requestOptions;

public class UploadFileOptions extends BaseOptions{

    String name;
    String on_duplicate;
    String folderId;
    String content_type;

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOn_duplicate() {
        return on_duplicate;
    }

    public void setOn_duplicate(String on_duplicate) {
        this.on_duplicate = on_duplicate;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public UploadFileOptions(String folderId, String on_duplicate, String name,String content_type) {
        this.folderId = folderId;
        this.on_duplicate = on_duplicate;
        this.name = name;
        this.content_type = content_type;
    }

}
