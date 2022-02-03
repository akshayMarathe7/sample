package practicePrograms;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 10, 15 };

		int[] b = new int[arr.length - 1];

		int index = 2;

		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) // 0=!3 1=!3 2=!3 3==3
			{
				continue;
			} else {

				b[k++] = arr[i]; // b[0]=1 b[1]=5 b[2]=10
			}

		}

		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}

	}

}
