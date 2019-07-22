package edu.ksu.canvas.requestOptions;

import java.util.List;

public class ListAssociatedCourseOptions extends BaseOptions {
    private String courseId;

    public ListAssociatedCourseOptions(String courseId) {
        this.courseId = courseId;
    }
    public ListAssociatedCourseOptions includes(List<String> coursesToChange) {
        addStringList("course_ids_to_add[]", coursesToChange);
        return this;
    }
    public String getCourseId() {
        return courseId;
    }
}
