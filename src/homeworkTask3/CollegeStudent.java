package homeworkTask3;

/**
 * Created by Юрий on 01.09.2016.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

   public CollegeStudent(String collegeName, int rating, long id){
       this.collegeName = collegeName;
       this.rating = rating;
       this.id = id;

   }

    public CollegeStudent(String lastName, Cource[] courcesTaken) {
        super(lastName, courcesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }


    public CollegeStudent() {
    }
}
