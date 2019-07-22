package edu.ksu.canvas.impl;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.AssociatedCourseReader;
import edu.ksu.canvas.interfaces.AssociatedCourseWriter;
import edu.ksu.canvas.interfaces.CanvasMessenger;
import edu.ksu.canvas.interfaces.ResponseParser;
import edu.ksu.canvas.model.AssociatedCourse;
import edu.ksu.canvas.model.Course;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
        import edu.ksu.canvas.oauth.OauthToken;
        import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;

        import java.io.IOException;
        import java.lang.reflect.Type;
        import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class AssociatedCourseImpl extends BaseImpl<AssociatedCourse, AssociatedCourseReader, AssociatedCourseWriter> implements AssociatedCourseReader, AssociatedCourseWriter {
    public AssociatedCourseImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient,
                                int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout,
                paginationPageSize, serializeNulls);
    }

    @Override
    public List<AssociatedCourse> listAssociatedCourses(ListAssociatedCourseOptions options) throws IOException {
        String url = buildCanvasUrl("/courses/"+options.getCourseId()+"/blueprint_templates/default/associated_courses",options.getOptionsMap());
        return getListFromCanvas(url);
    }
    @Override
    public Optional<AssociatedCourse> updateAssociations(ListAssociatedCourseOptions options, JsonObject coursesToAdd) throws IOException {
        String url = buildCanvasUrl("/courses/"+options.getCourseId()+"/blueprint_templates/default/update_associations",options.getOptionsMap());
        Response response = canvasMessenger.sendJsonPostToCanvas(oauthToken,url,coursesToAdd);
        return responseParser.parseToObject(AssociatedCourse.class, response);
    }
    @Override
    protected Type listType() {
        return new TypeToken<List<AssociatedCourse>>(){}.getType();
    }

    @Override
    protected Class<AssociatedCourse> objectType() {
        return AssociatedCourse.class;
    }
}
