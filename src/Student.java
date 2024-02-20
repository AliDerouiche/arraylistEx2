import java.util.*;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studente: " + this.name + "," + " Età: " + this.age + "\n";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ArrayList<Student> populateSet() {
        ArrayList<Student> set = new ArrayList<>();
        Student firstStudent = new Student("Luca", 10);
        Student secondStudent = new Student("Monica", 15);
        Student thirdStudent = new Student("Valerio", 29);
        Student fourthStudent = new Student("Giorgio",20);
        Student fifthStudent = new Student("Marta", 25);
        Student sixtStudent = new Student("Paolo", 30);
        Student seventhStudent = new Student("Gino", 19);
        Student eighthStudent = new Student("Mina", 16);
        Student ninthStudent = new Student("Veronica", 12);
        Student tenthStudent = new Student("Katia", 28);
        Student eleventhStudent = new Student("Emanuele",26);
        Student twelfthStudent = new Student("Fabio", 24);

        set.add(firstStudent);
        set.add(secondStudent);
        set.add(thirdStudent);
        set.add(fourthStudent);
        set.add(fifthStudent);
        set.add(sixtStudent);
        set.add(seventhStudent);
        set.add(eighthStudent);
        set.add(ninthStudent);
        set.add(tenthStudent);
        set.add(eleventhStudent);
        set.add(twelfthStudent);
        return set;
    }
}
