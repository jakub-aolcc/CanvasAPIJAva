package edu.ksu.canvas.model.coursemigration;

import edu.ksu.canvas.annotation.CanvasObject;
import edu.ksu.canvas.model.BaseCanvasModel;

import java.io.Serializable;

@CanvasObject(postKey = "pre_attachment")
public class UploadParams extends BaseCanvasModel implements Serializable {

    private String filename;
    private String content_type;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }
}
