package practicePrograms;

public class DuplicateInArray {

	public static void main(String[] args) {

		int numbers[] = { 100, 8, 10, 10,8 ,8};

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)

			{
				if (numbers[i]==numbers[j]) 
				
				{
					System.out.println("Duplicate found- " + numbers[i]);
				}
			}

		}

	}

}
