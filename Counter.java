package practicePrograms;

public class Counter {

	static int count = 0;

	public Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[])
	{
		// Creating objects
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}

}
