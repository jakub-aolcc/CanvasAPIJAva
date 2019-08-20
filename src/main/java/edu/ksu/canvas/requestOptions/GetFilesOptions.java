package edu.ksu.canvas.requestOptions;

public class GetFilesOptions extends BaseOptions {

    private String courseId;
    private String searchTerm;

    public GetFilesOptions(String courseId, String searchTerm){
        this.courseId = courseId;
        this.searchTerm = searchTerm;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }
}
