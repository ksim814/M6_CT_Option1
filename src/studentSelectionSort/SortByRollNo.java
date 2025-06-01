package studentSelectionSort;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        // UPDATE: fixed camelCase and added getter usage
        return Integer.compare(a.getRollNo(), b.getRollNo());
    }
}

