package practicePrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Collectionsproblem1 {
// Input is abaacaabac;
// output - aaaaaabbcc

	public static void main(String[] args) {

		String str = "abaacaabac";

		char[] cstr = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < cstr.length; i++) {
			char c = cstr[i];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {

				map.put(c, 1);
			}

		}

		System.out.println(map);

		Iterator<Character> it = map.keySet().iterator();

		while (it.hasNext()) {
			char key = it.next();
			int value = map.get(key);

			// System.out.print(key+" "+value);

			for (int i = 0; i < value; i++) {

				System.out.print(key);
			}

		}

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		a1.add(10);
		a1.add(12);
		a1.add(30);

		a2.add(90);
		a2.add(77);
		a2.add(101);
		a2.add(1);

		a1.addAll(a2);

//		System.out.println(a1);

	}

}
