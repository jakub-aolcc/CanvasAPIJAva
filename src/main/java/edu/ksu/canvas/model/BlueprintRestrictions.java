package edu.ksu.canvas.model;

import edu.ksu.canvas.annotation.CanvasField;

import java.io.Serializable;

public class BlueprintRestrictions extends BaseCanvasModel implements Serializable {
    public static final long serialVersionUID = 1L;

    private boolean content;
    private boolean points;
    private boolean dueDates;
    private boolean availabilityDates;

    public boolean isContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }

    public boolean isPoints() {
        return points;
    }

    public void setPoints(boolean points) {
        this.points = points;
    }
    @CanvasField(postKey = "due_dates")
    public boolean isDueDates() {
        return dueDates;
    }

    public void setDueDates(boolean dueDates) {
        this.dueDates = dueDates;
    }
    @CanvasField(postKey = "availability_dates")
    public boolean isAvailabilityDates() {
        return availabilityDates;
    }

    public void setAvailabilityDates(boolean availabilityDates) {
        this.availabilityDates = availabilityDates;
    }
}
