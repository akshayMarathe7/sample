package practicePrograms;

public class Print1To100WithoutUsingLOOPS {

	public static void method(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			method(num);
		}

	}

	public static void main(String[] args) {

		method(1);
	}

}
