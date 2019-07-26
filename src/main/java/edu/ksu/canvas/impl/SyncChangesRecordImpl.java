package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.SyncChangesRecordReader;
import edu.ksu.canvas.interfaces.SyncChangesRecordWriter;
import edu.ksu.canvas.model.ChangeRecord;
import edu.ksu.canvas.model.CourseMigration;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.CourseMigrationOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class SyncChangesRecordImpl extends BaseImpl<ChangeRecord, SyncChangesRecordReader, SyncChangesRecordWriter> implements SyncChangesRecordReader, SyncChangesRecordWriter {
        public SyncChangesRecordImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                                   int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
            super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                    paginationPageSize, serializeNulls);
}

    @Override
    public List<ChangeRecord> getUnsyncedChanges(CourseMigrationOptions options) throws IOException {
        String url = buildCanvasUrl("/courses/" + options.getCourseId() + "/blueprint_templates/default/unsynced_changes", options.getOptionsMap());
        return getListFromCanvas(url);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<ChangeRecord>>(){}.getType();
    }

    @Override
    protected Class<ChangeRecord> objectType() {
        return ChangeRecord.class;
    }
}
