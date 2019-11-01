package edu.ksu.canvas.enums;

public enum CourseEvents {
    CLAIM,
    OFFER,
    CONCLUDE,
    DELETE,
    UNDELETE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
