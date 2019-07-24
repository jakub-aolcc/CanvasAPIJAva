package edu.ksu.canvas.requestOptions;

import edu.ksu.canvas.model.AddingCourseIds;

import java.util.List;

public class ListAssociatedCourseOptions extends BaseOptions {
    private String courseId;

    public ListAssociatedCourseOptions(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }
}
