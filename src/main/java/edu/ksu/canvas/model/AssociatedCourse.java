package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;

@CanvasObject(postKey = "associated_course")
public class AssociatedCourse extends BaseCanvasModel implements Serializable {
    private Integer id;
    private String name;
    private String courseCode;
    private String sisCourseId;
    private String termName;
    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @CanvasField(postKey="course_code")
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    @CanvasField(postKey="sis_course_id")
    public String getSisCourseId() {
        return sisCourseId;
    }

    public void setSisCourseId(String sisCourseId) {
        this.sisCourseId = sisCourseId;
    }
    @CanvasField(postKey="term_name")
    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }
    @CanvasField(postKey="teachers")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}