package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.NotificationPreferences;
import edu.ksu.canvas.requestOptions.NotificationPreferencesOptions;

import java.io.IOException;
import java.util.Optional;

public interface NotificationPreferencesWriter extends CanvasWriter<NotificationPreferences,NotificationPreferencesWriter> {

    Optional<NotificationPreferences> updateAPreference(NotificationPreferences notificationPreferences, NotificationPreferencesOptions options) throws IOException;
}
