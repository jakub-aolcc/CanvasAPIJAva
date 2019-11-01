package edu.ksu.canvas.requestOptions;

import java.util.List;

public class UpdateCourseOptions extends BaseOptions {
    private String accountId;


    public enum course{claim,offer,conclude,delete,undelete}

    public UpdateCourseOptions(String accountId) {
        this.accountId = accountId;
    }

    public UpdateCourseOptions includes(List<course> course) {
        addEnumList("course[event]", course);
        return this;
    }
    public UpdateCourseOptions courseIds(List<course> courseIds) {
        addEnumList("course_ids[]", courseIds);
        return this;
    }

}
