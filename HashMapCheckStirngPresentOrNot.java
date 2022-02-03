package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapCheckStirngPresentOrNot {

	public static void main(String[] args) {

		HashMap<String, String> maps = new HashMap<>();

		maps.put("jadhav", "a");
		maps.put("pratiksha", "b");
		maps.put("pune", "c");
		System.out.println(maps.get("pune"));

		//can we do using existing method from map interface?
		if (maps.containsKey("jadhav"))
		{
			System.out.println("----using existing method form map------");
			System.out.println("value for jadhav- "+maps.get("jadhav"));
		}
		
		
		Iterator<String> it = maps.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			String value=maps.get(key);
			if(key.equals("pratiksha"))
			{	
				System.out.println("pratiksha is present");
				System.out.println("value of key is- "+maps.get(key));
				
			}
			else
			{
				System.out.println("not present");
			}
			
			
		}

	}

}
