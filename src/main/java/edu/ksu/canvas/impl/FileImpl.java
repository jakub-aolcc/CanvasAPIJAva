package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;

import edu.ksu.canvas.interfaces.FileReader;
import edu.ksu.canvas.interfaces.FileWriter;
import edu.ksu.canvas.model.File;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.GetFilesOptions;

import java.io.IOException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FileImpl extends BaseImpl<File, FileReader, FileWriter> implements FileReader, FileWriter {
    public FileImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                    int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<File> getMatchingFiles(GetFilesOptions options) throws IOException {
       String url = buildCanvasUrl("courses/"+options.getCourseId()+"/files?"+options.getSearchTerm(), options.getOptionsMap());
        return getListFromCanvas(url);
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
