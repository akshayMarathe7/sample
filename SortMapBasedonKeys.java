package practicePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortMapBasedonKeys {

	public static void main(String[] args) {
	
		HashMap <Integer,String> maps=new HashMap<>();
		
		maps.put(3, "akshay");
		maps.put(1, "marathe");
		maps.put(10, "pune");
		maps.put(2,"india");
		
//		HashMap <Integer,String> newmap=new HashMap<>();
		
		TreeMap<Integer,String> tmap=new TreeMap<>(maps);
		
		
		System.out.println(maps);
		
//
//		Iterator<Integer> it=maps.keySet().iterator();
//		Set<Integer>smap= maps.keySet();
//		TreeSet<Integer> treeSet = (TreeSet<Integer>) smap;
//		
//		System.out.println(treeSet);
//		
//		
//		
//		
//		while(it.hasNext())
//		{
//			int key=it.next();
//			String value=maps.get(key);
//			
//			if(key>))
//			
//		}	
//		
//		

	}

}
