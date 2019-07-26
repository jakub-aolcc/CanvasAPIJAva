package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;
import java.util.List;

@CanvasObject(postKey = "change_record")
public class ChangeRecord extends BaseCanvasModel implements Serializable {

    private Integer assetId;
    private String assetType;
    private String assetName;
    private String changeType;
    private String htmlUrl;
    private boolean locked;
    private List<Exceptions> exceptions;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public List<Exceptions> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<Exceptions> exceptions) {
        this.exceptions = exceptions;
    }
}