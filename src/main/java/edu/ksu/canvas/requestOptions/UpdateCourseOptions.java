package edu.ksu.canvas.requestOptions;

import java.util.List;

public class UpdateCourseOptions extends BaseOptions {
    private String accountId;


    public enum Include {offer,conclude,delete,undelete}

    public UpdateCourseOptions(String accountId) {
        this.accountId = accountId;
    }

    public UpdateCourseOptions includes(List<GetSingleCourseOptions.Include> includes) {
        addEnumList("event", includes);
        return this;
    }
    public UpdateCourseOptions courseIds(List<String> courseIds) {
        optionsMap.put("course_ids[]", courseIds);
        return this;
    }

}
