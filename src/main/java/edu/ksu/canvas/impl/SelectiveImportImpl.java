package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.CourseMigrationReader;
import edu.ksu.canvas.interfaces.CourseMigrationWriter;
import edu.ksu.canvas.interfaces.SelectiveImportItemsReader;
import edu.ksu.canvas.interfaces.SelectiveImportItemsWriter;
import edu.ksu.canvas.model.CourseMigration;
import edu.ksu.canvas.model.SelectiveImport;
import edu.ksu.canvas.model.SubItems;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.SelectiveImportItemsOptions;
import edu.ksu.canvas.requestOptions.SubItemsOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class SelectiveImportImpl extends BaseImpl<SelectiveImport, SelectiveImportItemsReader, SelectiveImportItemsWriter> implements SelectiveImportItemsReader, SelectiveImportItemsWriter {
    public SelectiveImportImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                               int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<SelectiveImport> getSelectiveImportItems(SelectiveImportItemsOptions option) throws IOException {
        String url = buildCanvasUrl("/courses/"+option.getCourseId()+"/content_migrations/"+option.getMigrationId()+"/selective_data",option.getOptionsMap());
        return getListFromCanvas(url);
    }

    @Override
    public List<SelectiveImport> getSubItems(SubItemsOptions option) throws IOException{
        String url = buildCanvasUrl(option.getSubItemsURL(),option.getOptionsMap());
        return getListFromCanvas(url);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<SelectiveImport>>(){}.getType();
    }

    @Override
    protected Class<SelectiveImport> objectType() {
        return SelectiveImport.class;
    }


}