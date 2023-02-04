package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

class CustomComp implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
        // return s1.name.compareTo(s2.name);   to compare string
    }
}

public class ArrayListWithClassObject {

    ArrayList<Student> studentsInfo = new ArrayList<>();

    private void displayStudent() {
        for (Student st: studentsInfo) {
            System.out.println("RollNo: " + st.rollNo + " Name: " + st.name + " Age: " + st.age);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayListWithClassObject ob = new ArrayListWithClassObject();
        ob.studentsInfo.add(new Student(1, "Chandan", 29));
        ob.studentsInfo.add(new Student(2, "Vikas", 35));
        ob.studentsInfo.add(new Student(3, "Vikki", 27));
        ob.studentsInfo.add(new Student(4, "Alok", 33));

        System.out.println("Before Sorting:");
        ob.displayStudent();

        Collections.sort(ob.studentsInfo, new CustomComp());
        System.out.println("After Sorting:");
        ob.displayStudent();
    }
}
