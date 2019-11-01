package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.CommunicationChannel;
import edu.ksu.canvas.requestOptions.CommunicationChannelOptions;

import java.io.IOException;
import java.util.List;


public interface CommunicationChannelReader extends CanvasReader<CommunicationChannel, CommunicationChannelReader>{

    /**
     * Return the communication channels for the specified user
     * @param options
     * @return
     */
    List<CommunicationChannel> getCommunicationChannels(CommunicationChannelOptions options) throws IOException;
}
