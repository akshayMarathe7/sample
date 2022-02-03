package practicePrograms;

// 3. Is it possible to compile and run a java program without writing a main
// method.?
// Yes we can do that with static block. There are 2 ways
// 1st way- to do that we have to create the object
// of class, and as soon as object is created
// the class will be loaded and static blocks will be executed
// 2nd way- if we call the static varibale of the class then also it class will run

public class StaticBlockConcepts2 {
	
		public static void main(String[] args) {

//1st way
			StaticBlockConcepts22 obj = new StaticBlockConcepts22();

//2nd way		
		//	System.out.println(StaticBlockConcepts22.i);

	}

}

class StaticBlockConcepts22 {

	static int i = 100;

	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}

}
