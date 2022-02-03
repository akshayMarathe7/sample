package practicePrograms;

public class LetterExistOrNot {

	public static void main(String[] args) {
		
		int count=0;									
		String name="testttasas     tt";
		char[] newName=name.toCharArray();

		for (int i=0;i<newName.length;i++)
		{
			if(newName[i]=='t')
			{
				count++;
					}

			}

		System.out.println(count);

	}

}
