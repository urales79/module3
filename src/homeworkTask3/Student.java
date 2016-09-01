package homeworkTask3;

/**
 * Created by Юрий on 01.09.2016.
 */
public class Student {
    String firstName;
    String lastName;
    int group;
    Cource[] courcesTaken;
    int age;

    public Student(String lastName, Cource[] courcesTaken) {
        this.lastName = lastName;
        this.courcesTaken = this.courcesTaken;
    }

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student() {

    }
}
