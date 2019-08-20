package edu.ksu.canvas.model;

import java.io.Serializable;

public class File extends BaseCanvasModel implements Serializable {

    private int id;
    private String uuid;
    private int folderId;
    private String displayName;
    private String filename;
    private String workflowState;
    private String uploadStatus;
    private String contentType;
    private String url;
    private int size;
    private String createdAt;
    private String updatedAt;
    private String unlockAt;
    private boolean locked;
    private boolean hidden;
    private boolean hiddenForUser;
    private String modifiedAt;
    private String mimeClass;
    private String mediaEntryId;
    private boolean lockedForUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isHiddenForUser() {
        return hiddenForUser;
    }

    public void setHiddenForUser(boolean hiddenForUser) {
        this.hiddenForUser = hiddenForUser;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getMimeClass() {
        return mimeClass;
    }

    public void setMimeClass(String mimeClass) {
        this.mimeClass = mimeClass;
    }

    public String getMediaEntryId() {
        return mediaEntryId;
    }

    public void setMediaEntryId(String mediaEntryId) {
        this.mediaEntryId = mediaEntryId;
    }

    public boolean isLockedForUser() {
        return lockedForUser;
    }

    public void setLockedForUser(boolean lockedForUser) {
        this.lockedForUser = lockedForUser;
    }
}
