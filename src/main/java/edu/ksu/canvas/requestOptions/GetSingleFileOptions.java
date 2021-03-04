package edu.ksu.canvas.requestOptions;

public class GetSingleFileOptions extends BaseOptions {

    String fileId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public GetSingleFileOptions(String fileId){ this.fileId = fileId;}
}
