package practicePrograms;

public class MinNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 100, 200, 5, 500, 100 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {

				min = arr[i];

			}

		}
		System.out.println("min number is- " + min);

	}

}
