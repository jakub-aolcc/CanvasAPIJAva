package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;

import java.io.Serializable;

@CanvasObject(postKey = "settings")
public class Settings extends BaseCanvasModel implements Serializable {
    private Integer source_course_id;
    private String source_course_name;
    private String source_course_html_url;

    public Integer getSource_course_id() {
        return source_course_id;
    }

    public void setSource_course_id(Integer source_course_id) {
        this.source_course_id = source_course_id;
    }

    public String getSource_course_name() {
        return source_course_name;
    }

    public void setSource_course_name(String source_course_name) {
        this.source_course_name = source_course_name;
    }

    public String getSource_course_html_url() {
        return source_course_html_url;
    }

    public void setSource_course_html_url(String source_course_html_url) {
        this.source_course_html_url = source_course_html_url;
    }
}