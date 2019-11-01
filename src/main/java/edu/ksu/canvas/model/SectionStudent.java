package edu.ksu.canvas.model;

import java.io.Serializable;

public class SectionStudent extends BaseCanvasModel implements Serializable {
    public static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String created_at;
    private String sortable_name;
    private String short_name;
    private String sis_user_id;
    private String integration_id;
    private String sis_import_id;
    private String login_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getSortable_name() {
        return sortable_name;
    }

    public void setSortable_name(String sortable_name) {
        this.sortable_name = sortable_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getSis_user_id() {
        return sis_user_id;
    }

    public void setSis_user_id(String sis_user_id) {
        this.sis_user_id = sis_user_id;
    }

    public String getIntegration_id() {
        return integration_id;
    }

    public void setIntegration_id(String integration_id) {
        this.integration_id = integration_id;
    }

    public String getSis_import_id() {
        return sis_import_id;
    }

    public void setSis_import_id(String sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }
}
