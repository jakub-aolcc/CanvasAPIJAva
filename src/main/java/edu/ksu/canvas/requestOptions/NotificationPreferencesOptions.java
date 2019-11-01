package edu.ksu.canvas.requestOptions;

public class NotificationPreferencesOptions extends BaseOptions{
    public String CommunicationChannelId;
    public String userId;
    public String notification;

    public NotificationPreferencesOptions(String communicationChannelId,String userId,String notification){
        this.notification = notification;
        this.userId = userId;
        this.CommunicationChannelId = communicationChannelId;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getCommunicationChannelId() {
        return CommunicationChannelId;
    }

    public void setCommunicationChannelId(String communicationChannelId) {
        CommunicationChannelId = communicationChannelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
