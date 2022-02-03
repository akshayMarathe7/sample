package practicePrograms;

public class MaxNumberInArray {

	public static void main(String[] args) {
		
		String s="test";
		System.out.println(s.length());

		int arr[] = { 10000, 2000, 500, 9, 1900 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) // 19
		{

			if (arr[i] > max) // 19>500
			{
				max = arr[i];

			}

		}
		System.out.println("max number is- " + max);

	}
}
