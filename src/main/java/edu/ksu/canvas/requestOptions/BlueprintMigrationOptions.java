package edu.ksu.canvas.requestOptions;

import edu.ksu.canvas.model.BaseCanvasModel;

public class BlueprintMigrationOptions extends BaseOptions {

    private String courseId;
    private String migrationId;

    public BlueprintMigrationOptions(String courseId, String migrationId) {
        this.courseId = courseId;
        this.migrationId = migrationId;
    }

    public String getCourseId() {
        return courseId;
    }
    public String getMigrationId() {
        return migrationId;
    }
}
