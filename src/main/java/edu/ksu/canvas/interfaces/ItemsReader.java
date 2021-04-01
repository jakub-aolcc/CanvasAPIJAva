package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.module.Items;

import java.io.IOException;
import java.util.List;

public interface ItemsReader extends CanvasReader<Items,ItemsReader>{

    public List<Items> getItems(String courseId, String moduleId) throws IOException;

}
