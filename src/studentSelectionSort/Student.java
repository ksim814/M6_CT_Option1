package studentSelectionSort;

//UPDATE: fields are now private for better encapsulation
public class Student {
	private int rollNo;
	private String name;
	private String address;

	// Constructor
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		}

	// UPDATED: Getters (encapsulation-friendly access)
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return rollNo + " " + name + " " + address; //UPDATE: fixed spacing and camelCase
	}

}
