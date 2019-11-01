package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.CommunicationChannelReader;
import edu.ksu.canvas.interfaces.CommunicationChannelWriter;
import edu.ksu.canvas.model.CommunicationChannel;
import edu.ksu.canvas.model.Section;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.CommunicationChannelOptions;

import javax.naming.CommunicationException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CommunicationChannelImpl extends BaseImpl<CommunicationChannel, CommunicationChannelReader, CommunicationChannelWriter> implements CommunicationChannelReader, CommunicationChannelWriter {

    public CommunicationChannelImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                          int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<CommunicationChannel> getCommunicationChannels(CommunicationChannelOptions options) throws IOException {
        String createdUrl = buildCanvasUrl("users/"+options.getUserId()+"/communication_channels", Collections.emptyMap());
        return getListFromCanvas(createdUrl);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<CommunicationChannel>>(){}.getType();
    }

    @Override
    protected Class<CommunicationChannel> objectType() {
        return null;
    }
}
