package practicePrograms;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int numb = 3;

		for (int i = 1; i <= numb; i++) {

			fact = fact * i;

		}
		System.out.println(fact);
	}

}
