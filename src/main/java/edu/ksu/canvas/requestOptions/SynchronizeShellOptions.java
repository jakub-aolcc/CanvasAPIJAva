package edu.ksu.canvas.requestOptions;

public class SynchronizeShellOptions extends BaseOptions {

    private String courseId;

    public SynchronizeShellOptions(String courseId){ this.courseId = courseId;}

    public String getCourseId() {
        return courseId;
    }
}

