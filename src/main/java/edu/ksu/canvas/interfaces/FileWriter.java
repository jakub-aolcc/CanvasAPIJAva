package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.File;
import edu.ksu.canvas.model.coursemigration.PreAttachment;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.UpdateFilesOptions;
import edu.ksu.canvas.requestOptions.UploadFileOptions;

import java.io.IOException;
import java.util.Optional;

public interface FileWriter extends CanvasWriter<File, FileWriter> {

    Optional<File> updateFile(UpdateFilesOptions options) throws IOException;
    Optional<PreAttachment> uploadFile(UploadFileOptions options, OauthToken oauthToken) throws IOException;
}
