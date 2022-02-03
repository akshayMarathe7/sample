package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateElementInArrayDiffWays {

	public static void main(String[] args) {

		String name = "my name has akshay name name";

		String namearr[] = name.split(" ");
		System.out.println(namearr);

		for (int i = 0; i < namearr.length; i++) {

			for (int j = i + 1; j < namearr.length; j++) {
				if (namearr[i].equals(namearr[j])) {
					System.out.println("duplicate found- " + namearr[i] + " index is " + i + " " + j);
				}

			}

		}

		System.out.println("second way");

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < namearr.length; i++) {
			String str = namearr[i];

			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);

			}

		}

		System.out.println(map);

		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext())
		{
			String key=it.next();
			int value= map.get(key);
			
		//	System.out.println(key);
		//	System.out.println(value);
			if(value>1)
			{
				System.out.println("duplicate found");
				System.out.println(key +" " +map.get(key));
			}
			
		}
		

	}

}
