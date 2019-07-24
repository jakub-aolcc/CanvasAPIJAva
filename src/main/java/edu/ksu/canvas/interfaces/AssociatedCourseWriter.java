package edu.ksu.canvas.interfaces;

import com.google.gson.JsonObject;
import edu.ksu.canvas.model.AssociatedCourse;
import edu.ksu.canvas.model.BlueprintMigration;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;
import edu.ksu.canvas.requestOptions.SynchronizeShellOptions;

import java.io.IOException;
import java.util.Optional;

public interface AssociatedCourseWriter extends CanvasWriter<AssociatedCourse, AssociatedCourseWriter> {

    Optional<AssociatedCourse> updateAssociations(ListAssociatedCourseOptions options, JsonObject obj) throws IOException;

    Optional<BlueprintMigration> synchroniseShellsWithBlueprint (SynchronizeShellOptions options,JsonObject jsonObject) throws IOException;


}