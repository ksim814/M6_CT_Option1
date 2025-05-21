package studentSelectionSort;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Integer.compare(a.rollno, b.rollno);
    }
}

