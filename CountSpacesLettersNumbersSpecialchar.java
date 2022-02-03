package practicePrograms;

public class CountSpacesLettersNumbersSpecialchar {

	public static void main(String[] args) {
		
		String word="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char [] wordArray= word.toCharArray();

		int letter=0;
		int spaces=0;
		int numbers=0;
		int others=0;

		for (int i=0;i<wordArray.length;i++)
			if(Character.isLetter(wordArray[i]))
				{
					letter++;
					} 
			else if(Character.isDigit(wordArray[i]))
				{
					numbers++;
					}
			else if(Character.isSpaceChar(wordArray[i]))
				{
					spaces++;
					}

				else{
					others++;
						}
			
		System.out.println("totalLetters- "+letter);
		System.out.println("total numbers- " +numbers);
		System.out.println("total spaces- " +spaces);
		System.out.println("total special char " +others);

		

	}

}
