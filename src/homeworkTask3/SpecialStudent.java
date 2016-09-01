package homeworkTask3;

/**
 * Created by Юрий on 01.09.2016.
 */
public class SpecialStudent extends CollegeStudent{
    long secretKey;
    String email;

    public SpecialStudent(long secretKey, String email){

        this.secretKey = secretKey;
        this.email = email;

    }

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName, rating, id);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }
}
