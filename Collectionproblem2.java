package practicePrograms;

import java.util.HashMap;

public class Collectionproblem2 {

	public static void main(String[] args) {
	
		HashMap<String,Integer > map=new HashMap<>();
		
		map.put("akshay",1);
		map.put("marathe",2);
		map.put("jadhav",3);
	
			
			if(map.containsKey("jadhav"))
			{
				map.remove("jadhav");
			}
	
		
		System.out.println(map);

	}

}
