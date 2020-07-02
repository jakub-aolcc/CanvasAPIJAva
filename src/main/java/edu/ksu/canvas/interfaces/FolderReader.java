package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.Folder;
import edu.ksu.canvas.requestOptions.GetFoldersOptions;

import java.io.IOException;
import java.util.List;

public interface FolderReader extends CanvasReader<Folder, FolderReader> {

    List<Folder> getFolders(GetFoldersOptions options) throws IOException;
    List<Folder> getFoldersByPath(GetFoldersOptions options) throws IOException;
}
