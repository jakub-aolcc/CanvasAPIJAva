package edu.ksu.canvas.model;

import java.io.Serializable;
import java.util.Date;

public class BlueprintMigration extends BaseCanvasModel implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private Integer templateId;
    private Integer subscriptionId;
    private Integer userId;
    private String workflowState;
    private Date createdAt;
    private Date exportStartsAt;
    private Date importsQueuedAt;
    private Date importsCompletedAt;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExportStartsAt() {
        return exportStartsAt;
    }

    public void setExportStartsAt(Date exportStartsAt) {
        this.exportStartsAt = exportStartsAt;
    }

    public Date getImportsQueuedAt() {
        return importsQueuedAt;
    }

    public void setImportsQueuedAt(Date importsQueuedAt) {
        this.importsQueuedAt = importsQueuedAt;
    }

    public Date getImportsCompletedAt() {
        return importsCompletedAt;
    }

    public void setImportsCompletedAt(Date importsCompletedAt) {
        this.importsCompletedAt = importsCompletedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
