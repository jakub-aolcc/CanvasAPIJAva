package edu.ksu.canvas.requestOptions;

import java.util.List;

public class CourseMigrationOptions extends BaseOptions {


    private String courseId;
    private String migrationType;
    private String sourceCourseId;
    private Boolean selectiveImport;

    public CourseMigrationOptions(String courseId, String migrationType, String sourceCourseId, Boolean selectiveImport) {
        this.courseId = courseId;
        this.migrationType = migrationType;
        this.sourceCourseId = sourceCourseId;
        this.selectiveImport = selectiveImport;
    }

    public Boolean getSelectiveImport() {
        return selectiveImport;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getMigrationType(){return migrationType;}

    public String getSourceCourseId(){return sourceCourseId;}
}

