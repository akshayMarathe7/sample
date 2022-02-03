package practicePrograms;

public class ReverseWordsInString {

	public static void main(String args[]) {
//		String name = "jvp ma i";
//		String newName = "";
//		String[] nameArray = name.split(" ");
//
//		for (int i = nameArray.length - 1; i >= 0; i--) {
//			newName = newName + nameArray[i]+" ";
//
//		}
//		System.out.println(newName);
		
		

	    String name="i am pvj";
		String newName="";
		String[] nameArray=name.split(" ");

	for(int i=nameArray.length-1;i>=0;i--)
		{

		newName=newName+nameArray[i]+" ";
			}


	System.out.println((newName));

	}
}
