package practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class ListOfSteringJdhavIsPresent {

	public static void main(String[] args) {
		List <String> ls=new ArrayList<>();
		ls.add("akshay");
		ls.add("pratiksha");
		ls.add("jadhav");
		
		if(ls.contains("jadhav"))
		{
			System.out.println("elemnt found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
