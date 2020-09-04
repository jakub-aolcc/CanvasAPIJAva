package edu.ksu.canvas.requestOptions;

public class NotificationPreferencesOptions extends BaseOptions{
    public String CommunicationChannelId;
    public String userId;
    public String notification;
    public String notificationCategory;

    public NotificationPreferencesOptions(String communicationChannelId,String userId,String notification, String notificationCategory){
        this.notification = notification;
        this.userId = userId;
        this.CommunicationChannelId = communicationChannelId;
        this.notificationCategory = notificationCategory;
    }

    public String getNotificationCategory() {
        return notificationCategory;
    }

    public void setNotificationCategory(String notificationCategory) {
        this.notificationCategory = notificationCategory;
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
