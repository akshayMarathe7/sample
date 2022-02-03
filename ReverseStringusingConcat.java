package practicePrograms;

public class ReverseStringusingConcat {

	public static void main(String[] args) 
	{
		String name="akshay marathe"; //6
		String ReverseName="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			ReverseName=ReverseName+name.charAt(i);
		}
		System.out.println(ReverseName);

	}

}
