package edu.ksu.canvas.requestOptions;

import java.util.List;

public class CourseMigrationOptions extends BaseOptions {


    private String courseId;
    private String migrationType;
    private String sourceCourseId;

    public CourseMigrationOptions(String courseId, String migrationType, String sourceCourseId) {
        this.courseId = courseId;
        this.migrationType = migrationType;
        this.sourceCourseId = sourceCourseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getMigrationType(){return migrationType;}

    public String getSourceCourseId(){return sourceCourseId;}
}

