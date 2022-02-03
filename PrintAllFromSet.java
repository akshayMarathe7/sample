package practicePrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintAllFromSet {

	public static void main(String[] args) {
	
		Set<String> str=new HashSet<>();
		
		str.add("akshay");
		str.add("marathe");
		str.add("pune");
		str.add("pune");
		Iterator<String> it=str.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}

	}

}
