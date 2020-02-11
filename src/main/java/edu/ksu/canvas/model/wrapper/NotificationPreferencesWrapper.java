package edu.ksu.canvas.model.wrapper;

import edu.ksu.canvas.model.NotificationPreferences;

import java.util.List;

public class NotificationPreferencesWrapper {
    public List<NotificationPreferences> notificationPreferencesList;

    public List<NotificationPreferences> getNotificationPreferencesList() {
        return notificationPreferencesList;
    }

    public void setNotificationPreferencesList(List<NotificationPreferences> notificationPreferencesList) {
        this.notificationPreferencesList = notificationPreferencesList;
    }
}
