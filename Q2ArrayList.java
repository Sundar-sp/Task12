package task12;

import java.util.ArrayList;
import java.util.List;

public class Q2ArrayList {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println(list);
		for(String temp: list) {
			System.out.println(temp);
		}
		list.clear();
		System.out.println(list);
	}
}

Output:
[hello, world, java]
hello
world
java
[]
