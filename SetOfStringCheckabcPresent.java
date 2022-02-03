package practicePrograms;

import java.util.HashSet;
import java.util.Set;

public class SetOfStringCheckabcPresent {

	public static void main(String[] args) {

		Set<String> str=new HashSet<>();
		
		str.add("abc1");
		str.add("akshay");
		str.add("marathe");
		
	
		if (str.contains("abc"))
		{
			System.out.println("abc is present");
		}
		else
		{
		
		System.out.println("abc is not");
		}
		
	}

}
