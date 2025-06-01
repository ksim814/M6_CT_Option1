package studentSelectionSort;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {

    // Selection sort method
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();

        // Outer loop to go through all elements in the list
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; //UPDATED: camelCase for minIdx

            // Inner loop to find min element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIdx)) < 0) {
                    minIdx = j; //UPDATED: camelCase for minIdx
                }
            }

            // UPDATED: swap using helper method
            swap(list, i, minIdx);
        }
    }
    //UPDATED: helper method to ecapsulate swap logic
    private static void swap(ArrayList<Student> list, int i, int j) {
        Student temp = list.get(j);
        list.set(j, list.get(i));
        list.set(i, temp);        
    }
}

