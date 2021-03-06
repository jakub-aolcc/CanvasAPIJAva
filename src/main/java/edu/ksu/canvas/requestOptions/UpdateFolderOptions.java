package edu.ksu.canvas.requestOptions;

public class UpdateFolderOptions extends BaseOptions {

    private String folderId;
    private String lock_at;
    private String unlock_at;
    private boolean hidden;
    private boolean locked;

    public String getLock_at() {
        return lock_at;
    }

    public void setLock_at(String lock_at) {
        this.lock_at = lock_at;
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

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getFolderId() {
        return folderId;
    }



    public UpdateFolderOptions(String folderId){
        this.folderId=folderId;
    }

}
