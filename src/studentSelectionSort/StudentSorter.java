package studentSelectionSort;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {

    // Selection sort method
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();

        // Outer loop to go through all elements in the list
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            // Inner loop to find min element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(min_idx)) < 0) {
                    min_idx = j;
                }
            }

            // Swap the found min element with the first unsorted element
            Student temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        }
    }
}

