package edu.ksu.canvas.model;

import java.io.Serializable;
import java.util.List;

public class Exceptions extends BaseCanvasModel implements Serializable {

    private Integer courseID;
    private List<String> conflictingChanges;

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public List<String> getConflictingChanges() {
        return conflictingChanges;
    }

    public void setConflictingChanges(List<String> conflictingChanges) {
        this.conflictingChanges = conflictingChanges;
    }
}
