package practicePrograms;

public class WordExistInString {

	public static void main(String[] args) {
		String word = "this cool is not ";
		String[] wordArray = word.split(" ");

		for (int i = 0; i < wordArray.length; i++)
				if (wordArray[i].equals("cool"))
					//	if(wordArray[i]=="cool")  not allowed incase of string
			{

				System.out.println("found ");
				System.out.println("index is- " + i);
				System.out.println(wordArray[i]);

			}

	}

}
