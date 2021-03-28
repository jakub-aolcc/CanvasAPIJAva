package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;

@CanvasObject(postKey="selective_import")
public class SelectiveImport extends BaseCanvasModel implements Serializable {

    private String type;
    private String property;
    private String title;
    private Integer count;
    private String subItemsUrl;
    private String migration_id;

    public String getMigration_id() {
        return migration_id;
    }

    public void setMigration_id(String migration_id) {
        this.migration_id = migration_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSubItemsUrl() {
        return subItemsUrl;
    }

    public void setSubItemsUrl(String subItemsUrl) {
        this.subItemsUrl = subItemsUrl;
    }

}

