package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.FolderReader;
import edu.ksu.canvas.interfaces.FolderWriter;
import edu.ksu.canvas.model.File;
import edu.ksu.canvas.model.Folder;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.GetFoldersOptions;
import edu.ksu.canvas.requestOptions.UpdateFolderOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FolderImpl extends BaseImpl<Folder, FolderReader, FolderWriter> implements FolderReader, FolderWriter {
    public FolderImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                      int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<Folder> getFolders(GetFoldersOptions options) throws IOException {
        String url = buildCanvasUrl("courses/"+options.getCourseId()+"/folders", options.getOptionsMap());
        return getListFromCanvas(url);
    }
    @Override
    public Optional<Folder> updateFolder(UpdateFolderOptions options) throws IOException {
        String url = buildCanvasUrl("folders/"+options.getFolderId()+"?hidden="+options.isHidden()+"&lock_at="+options.getLock_at()+"&locked="+options.isLocked()+"&unlock_at="+options.getUnlock_at(), Collections.emptyMap());

       Response response = canvasMessenger.putToCanvas(oauthToken,url,Collections.emptyMap());
        return responseParser.parseToObject(Folder.class,response);
    }
    @Override
    public List<Folder> getFoldersByPath(GetFoldersOptions options) throws IOException {
        String url = buildCanvasUrl("courses/"+options.getCourseId()+"/folders/by_path/"+options.getFolderPath(),options.getOptionsMap());
        return  getListFromCanvas(url);
    }


    @Override
    protected Type listType() {
        return new TypeToken<List<Folder>>(){}.getType();
    }

    @Override
    protected Class<Folder> objectType() {
        return Folder.class;
    }
}

