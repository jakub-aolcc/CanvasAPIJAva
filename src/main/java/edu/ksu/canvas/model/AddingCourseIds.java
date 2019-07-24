package edu.ksu.canvas.model;

import com.google.gson.annotations.SerializedName;
import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;
import java.util.List;
@CanvasObject(postKey = "course_ids_to_add")
public class AddingCourseIds extends BaseCanvasModel implements Serializable {
    public static final long serialVersionUID = 1L;

    private List<Integer> courseIdsToAdd = null;

    public List<Integer> getCourseIdsToAdd() {
        return courseIdsToAdd;
    }

    public void setCourseIdsToAdd(List<Integer> courseIdsToAdd) {
        this.courseIdsToAdd = courseIdsToAdd;
    }

}

