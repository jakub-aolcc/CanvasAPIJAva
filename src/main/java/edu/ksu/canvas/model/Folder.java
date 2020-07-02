package edu.ksu.canvas.model;

import java.io.Serializable;

public class Folder extends BaseCanvasModel implements Serializable {

    private String context_type;
    private int context_id;
    private int files_count;
    private int position;
    private String updated_at;
    private String folders_url;
    private String files_url;
    private String full_name;
    private String lock_at;
    private int id;
    private int folders_count;
    private String name;
    private int parent_folder_id;
    private String created_at;
    private String unlock_at;
    private boolean hidden;
    private boolean hidden_for_user;
    private boolean locked;
    private boolean locked_for_user;
    private boolean for_submissions;

    public String getContext_type() {
        return context_type;
    }

    public void setContext_type(String context_type) {
        this.context_type = context_type;
    }

    public int getContext_id() {
        return context_id;
    }

    public void setContext_id(int context_id) {
        this.context_id = context_id;
    }

    public int getFiles_count() {
        return files_count;
    }

    public void setFiles_count(int files_count) {
        this.files_count = files_count;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getFolders_url() {
        return folders_url;
    }

    public void setFolders_url(String folders_url) {
        this.folders_url = folders_url;
    }

    public String getFiles_url() {
        return files_url;
    }

    public void setFiles_url(String files_url) {
        this.files_url = files_url;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLock_at() {
        return lock_at;
    }

    public void setLock_at(String lock_at) {
        this.lock_at = lock_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolders_count() {
        return folders_count;
    }

    public void setFolders_count(int folders_count) {
        this.folders_count = folders_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParent_folder_id() {
        return parent_folder_id;
    }

    public void setParent_folder_id(int parent_folder_id) {
        this.parent_folder_id = parent_folder_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUnlock_at() {
        return unlock_at;
    }

    public void setUnlock_at(String unlock_at) {
        this.unlock_at = unlock_at;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isHidden_for_user() {
        return hidden_for_user;
    }

    public void setHidden_for_user(boolean hidden_for_user) {
        this.hidden_for_user = hidden_for_user;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isLocked_for_user() {
        return locked_for_user;
    }

    public void setLocked_for_user(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public boolean isFor_submissions() {
        return for_submissions;
    }

    public void setFor_submissions(boolean for_submissions) {
        this.for_submissions = for_submissions;
    }
}
