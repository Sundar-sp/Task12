package task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Q3TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> employeeMap= new TreeMap<Integer, String>();
		employeeMap.put(101, "Sundar");
		employeeMap.put(102, "Ram");
		employeeMap.put(103, "john");
		employeeMap.put(104, "Gobi");
		employeeMap.put(105, "max");
		// Sorting the employee names
	    List<String> sortedNames = new ArrayList<>(employeeMap.values());
	    Collections.sort(sortedNames);

	    // Printing out the names of all employees in alphabetical order
	    System.out.println("Employee Names in Alphabetical Order:");
	    for (String name : sortedNames) {
	    	System.out.println(name);
		}

	}

}

Output:
Employee Names in Alphabetical Order:
Gobi
Ram
Sundar
john
max

