package practicePrograms;

public class StaticBlockConcepts {
	// 1. First static block will be executed then main method will be executed.
	// we can have n number of static blocks and we can write anywhre in class
	// blocks will be executed in the order they are written.

	// 2. Diffrence b/w Static methods and static block?-- Static block will be
	// executed automatically, we do not need to call it,
	// to excute static method we need to call it (directly by name or by
	// classname.staticMethodName.)
	
	

	public static void main(String[] args) {
		System.out.println("main method");
		staticMethod();

	}

	static {

		System.out.println("Static block 1");
	}
	static {

		System.out.println("Static block 2");
	}
	static {

		System.out.println("Static block 3");
	}

	public static void staticMethod() {
		System.out.println("static method");
	}

}
