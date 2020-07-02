package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.File;
import edu.ksu.canvas.requestOptions.UpdateFilesOptions;

import java.io.IOException;
import java.util.Optional;

public interface FileWriter extends CanvasWriter<File, FileWriter> {

    Optional<File> updateFile(UpdateFilesOptions options) throws IOException;
}
