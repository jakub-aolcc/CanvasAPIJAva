package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.NotificationPreferencesReader;
import edu.ksu.canvas.interfaces.NotificationPreferencesWriter;
import edu.ksu.canvas.model.Enrollment;
import edu.ksu.canvas.model.NotificationPreferences;
import edu.ksu.canvas.model.wrapper.NotificationPreferencesWrapper;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.NotificationPreferencesOptions;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NotificationPreferencesImpl extends BaseImpl<NotificationPreferences, NotificationPreferencesReader, NotificationPreferencesWriter> implements NotificationPreferencesReader,NotificationPreferencesWriter {

    public NotificationPreferencesImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                          int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public Optional<NotificationPreferences> updateAPreferenceCategory(NotificationPreferences notificationPreferences, NotificationPreferencesOptions options) throws IOException {
        String createdUrl = buildCanvasUrl("users/self/communication_channels/"+options.CommunicationChannelId+"/notification_preference_categories/"+options.notificationCategory, options.getOptionsMap());
        Response response = canvasMessenger.putToCanvas(oauthToken,createdUrl,notificationPreferences.toPostMap());
        return Optional.empty();
    }

    @Override
    public Optional<NotificationPreferences> updateAPreference(NotificationPreferences notificationPreferences, NotificationPreferencesOptions options) throws IOException {
        String createdUrl = buildCanvasUrl("users/self/communication_channels/"+options.CommunicationChannelId+"/notification_preferences/"+options.notification, options.getOptionsMap());
        Response response = canvasMessenger.putToCanvas(oauthToken,createdUrl,notificationPreferences.toPostMap());
        return Optional.empty();
    }



    @Override
    public List<NotificationPreferences> getSinglePreference(NotificationPreferencesOptions notificationPreferencesOptions) throws IOException {
        String createdUrl = buildCanvasUrl("/users/"+notificationPreferencesOptions.getUserId()+"/communication_channels/"+notificationPreferencesOptions.getCommunicationChannelId()+"/notification_preferences/"+notificationPreferencesOptions.getNotification(),notificationPreferencesOptions.getOptionsMap());
       List<Response> response = canvasMessenger.getFromCanvas(oauthToken,createdUrl);
        return parseGetSinglePreferenceList(response);
    }

    private List<NotificationPreferences> parseGetSinglePreferenceList(final List<Response> responses) {
        return responses.stream()
                .map(this::parseGetSinglePreferenceList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private List<NotificationPreferences> parseGetSinglePreferenceList(final Response response) {
        NotificationPreferencesWrapper wrapper = GsonResponseParser.getDefaultGsonParser(serializeNulls).fromJson(response.getContent(),NotificationPreferencesWrapper.class);
        return wrapper.getNotificationPreferencesList();
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
