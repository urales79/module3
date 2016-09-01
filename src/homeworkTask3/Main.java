package homeworkTask3;

/**
 * Created by Юрий on 01.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Cource cource = new Cource(5,"Jon","Bob");
        Cource cource1 = new Cource(10,"Bob","Steve");
        Cource cource2 = new Cource(15,"Den","Macs");
        Cource cource3 = new Cource(20,"Jimmy","Steven");
        Cource cource4 = new Cource(25,"Taras","Ben");
        Student student = new Student("Bob","Lion",2);
        CollegeStudent collegeStudent = new CollegeStudent("Steve",5,6);
        CollegeStudent collegeStudent1 = new CollegeStudent("Macs","Bob",5);
        SpecialStudent specialStudent = new SpecialStudent(500,"ur@myo.ua");
        SpecialStudent specialStudent1 = new SpecialStudent("Bob",5,6);
        SpecialStudent specialStudent2 = new SpecialStudent("Bob","Den",5);

    }
}
