package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.NotificationPreferencesReader;
import edu.ksu.canvas.interfaces.NotificationPreferencesWriter;
import edu.ksu.canvas.model.Enrollment;
import edu.ksu.canvas.model.NotificationPreferences;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.NotificationPreferencesOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NotificationPreferencesImpl extends BaseImpl<NotificationPreferences, NotificationPreferencesReader, NotificationPreferencesWriter> implements NotificationPreferencesReader,NotificationPreferencesWriter {

    public NotificationPreferencesImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                          int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public Optional<NotificationPreferences> updateAPreference(NotificationPreferences notificationPreferences, NotificationPreferencesOptions options) throws IOException {
        String createdUrl = buildCanvasUrl("users/self/communication_channels/"+options.CommunicationChannelId+"/notification_preferences/"+options.notification, options.getOptionsMap());
        Response response = canvasMessenger.putToCanvas(oauthToken,createdUrl,notificationPreferences.toPostMap());
        return Optional.empty();
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<NotificationPreferences>>(){}.getType();
    }

    @Override
    protected Class<NotificationPreferences> objectType() {
        return NotificationPreferences.class;
    }

}
