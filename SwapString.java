package practicePrograms;

public class SwapString {

	public static void main(String[] args) {
		String a = "test";

		String b = "QA";

		a = a + b; // testQA

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println("a is- " + a);
		System.out.println("b is- " + b);

// Using the Temp		

		System.out.println("using third temp");

		String first = "hello";
		String last = "word";
		String temp = "";

		temp = first;
		first = last;
		last = temp;

		System.out.println("fist is-" + first);
		System.out.println("last is-" + last);

	}

}
