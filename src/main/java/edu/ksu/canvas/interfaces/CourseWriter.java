package edu.ksu.canvas.interfaces;

import com.google.gson.JsonObject;
import edu.ksu.canvas.enums.CourseEvents;
import edu.ksu.canvas.model.Course;
import edu.ksu.canvas.requestOptions.ListAssociatedCourseOptions;
import edu.ksu.canvas.requestOptions.PublishOptions;
import edu.ksu.canvas.requestOptions.UpdateCourseOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CourseWriter extends CanvasWriter<Course, CourseWriter> {
    /**
     * Create a new course in Canvas
     * @param accountId the account ID of the account under which to place this course
     * @param course A course object containing the information needed to create a course in Canvas
     * @return The newly created course
     * @throws IOException When there is an error communicating with Canvas
     */
     Optional<Course> createCourse(String accountId, Course course) throws IOException;


     Optional<Course> resetCourse(String courseId, ListAssociatedCourseOptions options) throws IOException;

    Optional<Course> publishCourses(PublishOptions options, JsonObject obj) throws IOException;
    /**
      * Update a course in Canvas
      * @param course A course object containing the information needed to update a course in Canvas
      * @return The newly updated course
      * @throws IOException When there is an error communicating with Canvas
      */
      Optional<Course> updateCourse(Course course, List<CourseEvents> courseList) throws IOException;

    /**
     * @param courseId The ID of the course you wish to delete
     * @return true if the course was deleted
     * @throws IOException When there is an error communicating with Canvas
     */
     Boolean deleteCourse(String courseId) throws IOException;
}
