package task12;

import java.util.ArrayList;
import java.util.List;

public class Q4ListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sundar");
		list.add("Ram");
		list.add("john");
		list.add("Gobi");
		list.add("max");
		String arr[] = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			arr[i]= list.get(i);
			System.out.println(arr[i]);
		}
		

	}

}

Output:
Sundar
Ram
john
Gobi
max
