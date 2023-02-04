package DataStructure;

import java.util.Arrays;
import java.util.Collections;

public class ArraysWithClassObject {

    Student studentsInfo[] = new Student[4];

    private void displayStudent() {
        for (Student st: studentsInfo) {
            System.out.println("RollNo: " + st.rollNo + " Name: " + st.name + " Age: " + st.age);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArraysWithClassObject ob = new ArraysWithClassObject();
        ob.studentsInfo[0] = new Student(1, "Chandan", 29);
        ob.studentsInfo[1] = new Student(2, "Vikas", 35);
        ob.studentsInfo[2] = new Student(3, "Vikki", 27);
        ob.studentsInfo[3] = new Student(4, "Alok", 33);

        System.out.println("Before Sorting:");
        ob.displayStudent();

        Arrays.sort(ob.studentsInfo, new CustomComp());
        System.out.println("After Sorting:");
        ob.displayStudent();
    }
}
