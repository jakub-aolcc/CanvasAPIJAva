package edu.ksu.canvas.model.coursemigration;

import edu.ksu.canvas.annotation.CanvasObject;
import edu.ksu.canvas.model.BaseCanvasModel;

import java.io.Serializable;

@CanvasObject(postKey = "pre_attachment")
public class PreAttachment extends BaseCanvasModel implements Serializable {
    private String fileParam;
    private Object Progress;
    private String uploadUrl;
    private UploadParams uploadParams;

    public String getFileParam() {
        return fileParam;
    }

    public void setFileParam(String fileParam) {
        this.fileParam = fileParam;
    }

    public Object getProgress() {
        return Progress;
    }

    public void setProgress(Object progress) {
        Progress = progress;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public UploadParams getUploadParams() {
        return uploadParams;
    }

    public void setUploadParams(UploadParams uploadParams) {
        this.uploadParams = uploadParams;
    }
}