package studentSelectionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create array list of students
        ArrayList<Student> students = initializeStudents(); // UPDATE: Extracted into method

        // Print original list
        System.out.println("Original List:");
        printStudents(students); // UPDATE: Abstracted printing for reuse

        // Sort by name
        StudentSorter.selectionSort(students, new SortByName());
        System.out.println("\nSorted by name:");
        printStudents(students);

        // Sort by roll number
        StudentSorter.selectionSort(students, new SortByRollNo());  
        System.out.println("\nSorted by roll number:");
        printStudents(students);
     }
        // UPDATE: Cleaner organization, student list setup moved here
    private static ArrayList<Student> initializeStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(125, "- Cullen, Alice", " | Forks, WA"));
        students.add(new Student(184, "- Marsh, Randy", " | South Park, CO"));
        students.add(new Student(113, "- Holmes, Sherlock", " | London, UK"));
        students.add(new Student(104, "- White, Walter", " | Albaquerque, NM"));
        students.add(new Student(196, "- Hill, Bobby", " | Arlen, TX"));
        students.add(new Student(142, "- Griffin, Chris", " | Quahog, RI"));
        students.add(new Student(171, "- Shortman, Arnold", " | New York, NY"));
        students.add(new Student(155, "- Belcher, Tina", " | Seymour's Bay, NJ"));
        students.add(new Student(111, "- Pig, Peppa", " | London, UK"));
        students.add(new Student(139, "- Read, Arthur", " | Boston, MA"));
            return students;
    }

    // UPDATE: Reusable method for consistent output
    private static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
