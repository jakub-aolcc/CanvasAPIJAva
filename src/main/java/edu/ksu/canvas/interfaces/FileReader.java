package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.File;
import edu.ksu.canvas.requestOptions.GetFilesOptions;
import edu.ksu.canvas.requestOptions.GetFoldersOptions;
import edu.ksu.canvas.requestOptions.GetSingleFileOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FileReader extends CanvasReader<File, FileReader> {

    List<File> getMatchingFiles(GetFilesOptions options) throws IOException;
    List<File> getAllFiles(GetFilesOptions options) throws IOException;
    Optional<File> getFile (GetSingleFileOptions options) throws IOException;
}

