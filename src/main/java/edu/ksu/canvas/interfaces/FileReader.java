package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.File;
import edu.ksu.canvas.requestOptions.GetFilesOptions;

import java.io.IOException;
import java.util.List;

public interface FileReader extends CanvasReader<File, FileReader> {

    List<File> getMatchingFiles(GetFilesOptions options) throws IOException;
}

