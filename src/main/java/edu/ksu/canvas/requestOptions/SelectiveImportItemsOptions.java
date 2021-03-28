package edu.ksu.canvas.requestOptions;

import edu.ksu.canvas.model.SelectiveImport;

public class SelectiveImportItemsOptions extends BaseOptions{
    public String migrationId;
    public String courseId;

    public SelectiveImportItemsOptions(String migrationId, String courseId){
        this.migrationId = migrationId;
        this.courseId = courseId;

    }

    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
