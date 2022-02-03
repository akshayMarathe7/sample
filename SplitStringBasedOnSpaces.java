package practicePrograms;

public class SplitStringBasedOnSpaces {

	public static void main(String[] args) {

		String sentense = "this is me";

		String[] senstenseArray = sentense.split(" ");

		String newSenstes = " ";

		for (int i = 0; i < senstenseArray.length; i++)

		{
			System.out.println( senstenseArray[i].toString());
			
		}
	
		

	}

}
