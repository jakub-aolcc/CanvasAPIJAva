package edu.ksu.canvas.requestOptions;

import edu.ksu.canvas.model.CommunicationChannel;

public class CommunicationChannelOptions extends BaseOptions {
    public String userId;

    public CommunicationChannelOptions(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
