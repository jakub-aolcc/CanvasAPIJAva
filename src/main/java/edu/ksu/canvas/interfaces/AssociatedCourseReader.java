package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.AssociatedCourse;
import edu.ksu.canvas.model.BlueprintMigration;
import edu.ksu.canvas.requestOptions.BlueprintMigrationOptions;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface AssociatedCourseReader extends CanvasReader<AssociatedCourse, AssociatedCourseReader> {

    List<AssociatedCourse> listAssociatedCourses(ListAssociatedCourseOptions options) throws IOException;

    Optional<BlueprintMigration> getBluePrintMigration (BlueprintMigrationOptions options) throws IOException;
}
