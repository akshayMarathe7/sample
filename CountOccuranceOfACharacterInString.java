package practicePrograms;

public class CountOccuranceOfACharacterInString {

	public static void main(String[] args) {

		String name = "my name is akshay";
		char find = 'z';
		int count = 0;

		char namearr[] = name.toCharArray();

		for (int i = 0; i < namearr.length; i++) {
			if (namearr[i] == find) {
				count++;
			}

		}
		System.out.println( find +" is-" +count+" times");

	}

}
