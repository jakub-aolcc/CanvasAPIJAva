package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.AssociatedCourse;
import edu.ksu.canvas.model.CourseMigration;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.CourseMigrationOptions;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CourseMigrationWriter extends CanvasWriter<CourseMigration, CourseMigrationWriter> {

    Optional<CourseMigration> createCourseMigration(CourseMigrationOptions options) throws IOException;
}