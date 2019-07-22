package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.AssociatedCourse;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;

import java.io.IOException;
import java.util.List;

public interface AssociatedCourseReader extends CanvasReader<AssociatedCourse, AssociatedCourseReader> {

    List<AssociatedCourse> listAssociatedCourses(ListAssociatedCourseOptions options) throws IOException;
}
