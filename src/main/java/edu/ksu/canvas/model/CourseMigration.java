package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;
import edu.ksu.canvas.model.coursemigration.PreAttachment;

import java.io.Serializable;

@CanvasObject(postKey = "course_migrations")
public class CourseMigration extends BaseCanvasModel implements Serializable {
    private Integer id;
    private Integer user_id;
    private String workflow_state;
    private String started_at;
    private String finished_at;
    private String migration_type;
    private String created_at;
    private String migration_issues_url;
    private String migration_issues_count;
    private PreAttachment pre_attachment;
    private Settings settings;
    private String progress_url;
    private String migration_type_title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getFinished_at() {
        return finished_at;
    }

    public void setFinished_at(String finished_at) {
        this.finished_at = finished_at;
    }

    public String getMigration_type() {
        return migration_type;
    }

    public void setMigration_type(String migration_type) {
        this.migration_type = migration_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getMigration_issues_url() {
        return migration_issues_url;
    }

    public void setMigration_issues_url(String migration_issues_url) {
        this.migration_issues_url = migration_issues_url;
    }

    public String getMigration_issues_count() {
        return migration_issues_count;
    }

    public void setMigration_issues_count(String migration_issues_count) {
        this.migration_issues_count = migration_issues_count;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String getProgress_url() {
        return progress_url;
    }

    public void setProgress_url(String progress_url) {
        this.progress_url = progress_url;
    }

    public String getMigration_type_title() {
        return migration_type_title;
    }

    public void setMigration_type_title(String migration_type_title) {
        this.migration_type_title = migration_type_title;
    }

    public PreAttachment getPre_attachment() {
        return pre_attachment;
    }

    public void setPre_attachment(PreAttachment pre_attachment) {
        this.pre_attachment = pre_attachment;
    }
}