package edu.ksu.canvas.model.module;

import edu.ksu.canvas.model.BaseCanvasModel;

import java.io.Serializable;
import java.util.List;

public class Module extends BaseCanvasModel implements Serializable {

    private Integer id;
    private String name;
    private Integer position;
    private Object unlockAt;
    private Boolean requireSequentialProgress;
    private Boolean publishFinalGrade;
    private List<Object> prerequisiteModuleIds = null;
    private Boolean published;
    private Integer itemsCount;
    private String itemsUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Object getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(Object unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getRequireSequentialProgress() {
        return requireSequentialProgress;
    }

    public void setRequireSequentialProgress(Boolean requireSequentialProgress) {
        this.requireSequentialProgress = requireSequentialProgress;
    }

    public Boolean getPublishFinalGrade() {
        return publishFinalGrade;
    }

    public void setPublishFinalGrade(Boolean publishFinalGrade) {
        this.publishFinalGrade = publishFinalGrade;
    }

    public List<Object> getPrerequisiteModuleIds() {
        return prerequisiteModuleIds;
    }

    public void setPrerequisiteModuleIds(List<Object> prerequisiteModuleIds) {
        this.prerequisiteModuleIds = prerequisiteModuleIds;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
    }

    public String getItemsUrl() {
        return itemsUrl;
    }

    public void setItemsUrl(String itemsUrl) {
        this.itemsUrl = itemsUrl;
    }
}
