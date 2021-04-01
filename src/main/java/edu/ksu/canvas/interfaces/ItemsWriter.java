package edu.ksu.canvas.interfaces;

import com.google.gson.JsonObject;
import edu.ksu.canvas.model.module.Items;

import java.io.IOException;
import java.util.Optional;

public interface ItemsWriter extends CanvasWriter<Items,ItemsWriter> {
    /**
     * Update the items requirements
     * @param courseId
     * @param moduleId
     * @param itemId
     * @return
     * @throws IOException
     */
    Optional<Items> updateItemRequirement (String courseId, String moduleId, String itemId, JsonObject requestParams) throws IOException;

}
