package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.NotificationPreferences;
import edu.ksu.canvas.requestOptions.NotificationPreferencesOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface NotificationPreferencesReader extends CanvasReader<NotificationPreferences,NotificationPreferencesReader>{

    List<NotificationPreferences> getSinglePreference(NotificationPreferencesOptions options) throws IOException;


}
