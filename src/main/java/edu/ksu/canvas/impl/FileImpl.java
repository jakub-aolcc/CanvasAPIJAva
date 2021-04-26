package edu.ksu.canvas.impl;

import com.google.common.collect.ImmutableMap;
import com.google.gson.reflect.TypeToken;

import edu.ksu.canvas.interfaces.FileReader;
import edu.ksu.canvas.interfaces.FileWriter;
import edu.ksu.canvas.interfaces.ResponseParser;
import edu.ksu.canvas.model.File;
import edu.ksu.canvas.model.coursemigration.PreAttachment;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.GetFilesOptions;
import edu.ksu.canvas.requestOptions.GetSingleFileOptions;
import edu.ksu.canvas.requestOptions.UpdateFilesOptions;
import edu.ksu.canvas.requestOptions.UploadFileOptions;

import java.io.IOException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileImpl extends BaseImpl<File, FileReader, FileWriter> implements FileReader, FileWriter {
    public FileImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                    int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<File> getMatchingFiles(GetFilesOptions options) throws IOException {
       String url = buildCanvasUrl("courses/"+options.getCourseId()+"/files?search_term="+options.getSearchTerm(), options.getOptionsMap());
        return getListFromCanvas(url);
    }
    @Override
    public Optional<File> updateFile(UpdateFilesOptions options) throws IOException {

       String url = buildCanvasUrl("files/"+options.getFileId()+"?hidden="+options.isHidden()+"&lock_at="+options.getLock_at()+"&locked="+options.isLocked()+"&unlock_at="+options.getUnlock_at(), Collections.emptyMap());
       Response response = canvasMessenger.putToCanvas(oauthToken,url,Collections.emptyMap());
       return responseParser.parseToObject(File.class,response);
    }
    @Override
    public List<File> getAllFiles(GetFilesOptions options) throws IOException {
        String url = buildCanvasUrl("courses/"+options.getCourseId()+"/files",options.getOptionsMap());
        return getListFromCanvas(url);
    }
    @Override
    public Optional<File> getFile(GetSingleFileOptions options) throws IOException {
        String url = buildCanvasUrl("files/"+options.getFileId(),options.getOptionsMap());
        return getFromCanvas(url);
    }

    @Override
    public Optional<PreAttachment> uploadFile(UploadFileOptions options, OauthToken oauthToken) throws IOException {
        String url = buildCanvasUrl("folders/"+options.getFolderId()+"/files?name="+options.getName()+"&parent_folder_id="+options.getFolderId()+"&on_duplicate="+options.getOn_duplicate()+"&content_type="+options.getContent_type(),options.getOptionsMap());
        Response response = canvasMessenger.sendToCanvas(oauthToken,url,Collections.emptyMap());
        return responseParser.parseToObject(PreAttachment.class,response);
    }



    @Override
    protected Type listType() {
        return new TypeToken<List<File>>(){}.getType();
    }

    @Override
    protected Class<File> objectType() {
        return File.class;
    }
}
