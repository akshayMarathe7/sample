package practicePrograms;

// Null is case sensetive in java, and keywords are written in lower case in java
// so it should be written as null only(NULL, Null not acceptable);
public class NullConcepts {	
	 
	static Object ob;
	NullConcepts nonstaticObj;
	int i=10;
	static int j=34;
	
	
	public static void main(String[] args) {

//1. Case sensitive can be written as null only		

		Object obj = null;		// Object obj1=Null; // not allowed

		System.out.println(obj);
		NullConcepts nobj=new NullConcepts();
		System.out.println(NullConcepts.j);
		System.out.println(nobj.i=99);

//2. If nothing is assigned to object then it will be set to null by default.
		
		NullConcepts obj2;
				
	}
	
	public  static void tetsMethod()
	{
//		System.out.println(nonstaticObj);
				
	}

}
