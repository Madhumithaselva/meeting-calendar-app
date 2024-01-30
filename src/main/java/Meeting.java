package se.lexicon.model;

import java.time.LocalTime;

public class Meeting {

    // TODO - Implement This Class
    private int id;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private MeetingCalendar calendar;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public MeetingCalendar getCalendar() {
        return calendar;
    }

    public void displayUserInfo(){
        System.out.println("Meeting{" +
                "id=" + id +
                ", title=" + title +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", description=" + description +
                ", calendar=" + calendar +
                '}');
    }
}
