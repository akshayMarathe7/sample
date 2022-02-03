package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;

public class IteratorThroughMap {

	public static void main(String[] args) {
		HashMap<Integer, String> maps = new HashMap<>();

		maps.put(1, "akshay");
		maps.put(10, "marathe");
		maps.put(30, "pune");

		Iterator<Integer> it = maps.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			String value = maps.get(key);
			System.out.println("keys are- "+key+ " values are-" +value);

		}

	}

}
