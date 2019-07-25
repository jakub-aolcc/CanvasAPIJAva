package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.CourseMigrationReader;
import edu.ksu.canvas.interfaces.CourseMigrationWriter;
import edu.ksu.canvas.model.Course;
import edu.ksu.canvas.model.CourseMigration;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.CourseMigrationOptions;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class CourseMigrationImpl extends BaseImpl<CourseMigration, CourseMigrationReader, CourseMigrationWriter> implements CourseMigrationReader, CourseMigrationWriter {
    public CourseMigrationImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                                int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }



    @Override
    public Optional<CourseMigration> createCourseMigration(CourseMigrationOptions options) throws IOException {
        String url = buildCanvasUrl("/courses/"+options.getCourseId()+"/content_migrations?migration_type="+options.getMigrationType()+"&settings[source_course_id]="+options.getSourceCourseId(),options.getOptionsMap());
        System.out.println(url);
        return copyCourseFromSource(oauthToken,url,options);
    }
    private Optional<CourseMigration> copyCourseFromSource(OauthToken oauthToken, String url,CourseMigrationOptions options) throws IOException {
        Response response = canvasMessenger.sendToCanvas(oauthToken,url,options.getOptionsMap());
        if(response.getErrorHappened() || response.getResponseCode() !=200){
            return Optional.empty();
        }
        return responseParser.parseToObject(CourseMigration.class, response);
    }

    @Override
    public Optional<CourseMigration> getCourseMigrationStatus(CourseMigrationOptions options) throws IOException {
        String url = buildCanvasUrl("/courses/"+options.getCourseId()+"/content_migrations",options.getOptionsMap());
        Response response = canvasMessenger.getSingleResponseFromCanvas(oauthToken,url);
        return responseParser.parseToObject(CourseMigration.class,response);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<CourseMigration>>(){}.getType();
    }

    @Override
    protected Class<CourseMigration> objectType() {
        return CourseMigration.class;
    }


}