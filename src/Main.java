import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = Student.populateSet();

        System.out.println("Before ordering the list");
        System.out.println(studentArrayList);

        studentArrayList.sort(Comparator.comparing(Student::getName));
        System.out.println("After ordering the list by alphabetical order");
        System.out.println(studentArrayList);
    }

}