package edu.gcc.segfault;

import java.time.LocalTime;

public class Block {
    private Course course;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalTime enTime;
    private LocalTime nTime;
    private LocalTime Time;
    private LocalTime ime;

    //Getters and Setters
    public Course getCourse() {
        return course;
    } //Test comment

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
