package edu.ksu.canvas.requestOptions;

public class GetFoldersOptions extends BaseOptions{

    private String courseId;
    private String folderPath;


    public GetFoldersOptions(String courseId,String folderPath){
        this.courseId = courseId;
        this.folderPath = folderPath;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getFolderPath() {
        return folderPath;
    }
}
