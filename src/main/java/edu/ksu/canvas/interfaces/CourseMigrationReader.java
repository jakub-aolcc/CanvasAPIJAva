package edu.ksu.canvas.interfaces;

        import edu.ksu.canvas.model.AssociatedCourse;
        import edu.ksu.canvas.model.CourseMigration;
        import edu.ksu.canvas.model.SelectiveImport;
        import edu.ksu.canvas.requestOptions.CourseMigrationOptions;
        import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;
        import edu.ksu.canvas.requestOptions.SelectiveImportItemsOptions;

        import java.io.IOException;
        import java.util.List;
        import java.util.Optional;

public interface CourseMigrationReader extends CanvasReader<CourseMigration, CourseMigrationReader> {

        Optional<CourseMigration> getCourseMigrationStatus(CourseMigrationOptions options) throws IOException;
}