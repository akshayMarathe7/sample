package practicePrograms;

public class ArrayAllPrograms {
	
// push the code	

	public static void main(String[] args) {

//1.  Sort array

		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 90;
		arr[2] = 6;
		arr[3] = 1;

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println("___ReversArray_____ ");
//2. ReverseArray

// first way
		
		int numbers[] = { 10, 20, 30, 40 };
		int newnumbers[] = new int[numbers.length];

		int j = 0;

		for (int i = numbers.length - 1; i >= 0; i--) {
			newnumbers[j] = numbers[i];
			j++;
		}
		
		System.out.println("first way to reverese");

		for (int i = 0; i < newnumbers.length; i++) {
			System.out.print(newnumbers[i] + " ");
		}
		System.out.println(" ");

// second way
		
		int numbers1[] = { 15, 1, 14, 6 };
		
		
		for (int i = numbers1.length - 1, x = 0; i >= x; i--, x++) {
			int temp1 = numbers1[i];
			numbers1[i] = numbers1[x];
			numbers1[x] = temp1;

		}

		System.out.println("second way to reverse");

		for (int i = 0; i < numbers1.length; i++) {
			System.out.print(numbers1[i] + " ");
		}
		
// Delete element 	
			
		int elemnts[]= {10,20,30,50};		
		
			
			
	

	}

	
	
	

}
