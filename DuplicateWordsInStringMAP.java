package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInStringMAP {

	public static void main(String[] args) {

		String name = "java is language best java";

		String[] nameChar = name.split(" ");

		Map<String, Integer> Stringmap = new HashMap<>();

		for (int i = 0; i < nameChar.length; i++) // hey java my name is java
		{
			String word = nameChar[i];

			if (Stringmap.containsKey(word)) {
				Stringmap.put(word, Stringmap.get(word) + 1);

			} else {

				Stringmap.put(word, 1);

			}

		}

		
		System.out.println(Stringmap);
		System.out.println("*********");
		Iterator<String> it = Stringmap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = Stringmap.get(key);
			
			if(value>1)
			{
			System.out.println(key );
			}
		}
		System.out.println("second way to print values");

		for (String str : Stringmap.keySet()) {
			System.out.print(str + " ");
			System.out.println(Stringmap.get(str));
		}
		System.out.println(Stringmap.values());
//		for (int i: Stringmap.values())
//		{
//			System.out.println(i);
//			System.out.println(Stringmap.get(i)); // we can not get the key from values so when we try to get the key using values it will give null

//			
//			
//		}

	}

}
