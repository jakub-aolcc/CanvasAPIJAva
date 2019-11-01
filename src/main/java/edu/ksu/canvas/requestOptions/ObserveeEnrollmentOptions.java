package edu.ksu.canvas.requestOptions;

public class ObserveeEnrollmentOptions extends BaseOptions{

    private String sectionId;

    public ObserveeEnrollmentOptions(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
}
