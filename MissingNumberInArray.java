package practicePrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {

		// Add all the numbers in array
		// 1+2+3+4+5 =15
		// Then add only thr given elements in Array
		// 1+2+4+5 = 12
		// Subtract the result, and result will be the missing number

		int a[] = { 5, 6, 7, 9 };  //27
		int sum = 0;

		// add only given numbers in array
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}

		System.out.println("sum of availbale elemetns- " + sum);

		int AllSum = 0;

		// adding all the elements
		for (int i = 5; i <=9; i++) {
			AllSum = AllSum + i;
		}
		System.out.println("sum of all the elements- " + AllSum);
		
		
		System.out.println("Missing ele- " +(AllSum-sum));
		
		
	}

}
