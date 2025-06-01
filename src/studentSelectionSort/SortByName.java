package studentSelectionSort;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		// Uses getters instead of direct field access
		return a.getName().compareTo(b.getName());
	}
}
