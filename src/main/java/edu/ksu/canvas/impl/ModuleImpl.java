package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.ModuleReader;
import edu.ksu.canvas.interfaces.ModuleWriter;
import edu.ksu.canvas.model.Login;
import edu.ksu.canvas.model.module.Items;
import edu.ksu.canvas.model.module.Module;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyMap;

public class ModuleImpl extends BaseImpl<Module, ModuleReader, ModuleWriter> implements ModuleReader{

    private static final Logger LOG = Logger.getLogger(ModuleImpl.class);

    public ModuleImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                     int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<Module> getModules(String courseId) throws IOException {
        LOG.debug("Getting All Modules");
        String url = buildCanvasUrl("/courses/"+courseId+"/modules", emptyMap());
        return getListFromCanvas(url);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<Module>>() {
        }.getType();
    }

    @Override
    protected Class<Module> objectType() {
        return Module.class;
    }
}
