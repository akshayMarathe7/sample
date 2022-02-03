package practicePrograms;

public class FIndNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 50 };
		boolean numberFoun = true;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 50) {
				numberFoun = true;
				System.out.println(numbers[i]);
				break;
			} else {
				numberFoun = false;
			}

		}

		if (numberFoun) {
			System.out.println("number found");
		} else {
			System.out.println("number not found");
		}
	}

}
