package homeworkTask3;

import java.util.Date;

/**
 * Created by Юрий on 01.09.2016.
 */
public class Cource {
    private   Date starDate;
    private String name;
    private int hoursDuration;
    private   String teacherName;


    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStarDate() {
        return starDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Cource(Date starDate, String name) {
        this.starDate = starDate;
        this.name = name;
    }

    public Cource(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }
}
