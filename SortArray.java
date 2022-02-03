package practicePrograms;

public class SortArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 100, 50, 200, 7};
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++)
				if (numbers[i] > numbers[j]) // 10>7
				{

					temp = numbers[i]; // temp=10
					numbers[i] = numbers[j]; // [0]=7
					numbers[j] = temp; // [1]=10

				}

		}

		for (int k = 0; k < numbers.length; k++) {

			System.out.println(numbers[k]);
		}
	}
}