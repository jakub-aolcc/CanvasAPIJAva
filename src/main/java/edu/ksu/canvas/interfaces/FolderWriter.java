package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.Folder;
import edu.ksu.canvas.requestOptions.UpdateFolderOptions;

import java.io.IOException;
import java.util.Optional;

public interface FolderWriter extends CanvasWriter<Folder,FolderWriter>{
    Optional<Folder> updateFolder(UpdateFolderOptions options) throws IOException;
}
