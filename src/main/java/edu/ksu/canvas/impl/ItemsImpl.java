package edu.ksu.canvas.impl;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.ItemsReader;
import edu.ksu.canvas.interfaces.ItemsWriter;
import edu.ksu.canvas.interfaces.ModuleReader;
import edu.ksu.canvas.interfaces.ModuleWriter;
import edu.ksu.canvas.model.Login;
import edu.ksu.canvas.model.module.Items;
import edu.ksu.canvas.model.module.Module;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyMap;

public class ItemsImpl extends BaseImpl<Items, ItemsReader, ItemsWriter> implements ItemsWriter,ItemsReader{

      private static final Logger LOG = Logger.getLogger(ItemsImpl.class);

      public ItemsImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                        int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
          super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                    paginationPageSize, serializeNulls);
      }

        @Override
        public List<Items> getItems(String courseId, String moduleId) throws IOException {
            LOG.debug("Getting all Module items");
            String url = buildCanvasUrl("/courses/"+courseId+"/modules/"+moduleId+"/items",emptyMap());
            return getListFromCanvas(url);
        }

        @Override
        public Optional<Items> updateItemRequirement(String courseId, String moduleId, String itemId, JsonObject requestParams) throws IOException {
          LOG.debug("Updating item's requirements field");
          String url = buildCanvasUrl("/courses/"+courseId+"/modules/"+moduleId+"/items/"+itemId+"?module_item[completion_requirement][type]=must_view", emptyMap());
          Response response = canvasMessenger.sendJsonPutToCanvas(oauthToken,url,requestParams);
          return responseParser.parseToObject(Items.class,response);
        }

        @Override
        protected Type listType() {
            return new TypeToken<List<Items>>() {
            }.getType();
        }

        @Override
        protected Class<Items> objectType() {
            return Items.class;
        }
}

