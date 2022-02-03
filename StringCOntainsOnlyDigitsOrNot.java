package practicePrograms;

public class StringCOntainsOnlyDigitsOrNot {

	public static void main(String[] args) {
		
		String name="11akshay1";
		boolean flag=true;
		for (int i=0;i<name.length();i++)
		{
			
			if(!Character.isDigit(name.charAt(i)))
			{
				flag=false;
				
			}
			else
			{
				flag=true;
			}
		}
		
		if (flag)
		{
			System.out.println("numeric");
		}
		else
		{
			System.out.println("not numeric");
		}
	}

}
