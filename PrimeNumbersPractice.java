package practicePrograms;

public class PrimeNumbersPractice {

	public static void main (String args[])
	{

		int num=3;
		boolean flag=true;

	for(int i=2;i<num;i++)
	{

		if(num%i==0)

			{
				flag=false;
				break;
				}			
			}

		if(flag)
		{
			System.out.println("number is prime");
			}

		else
		{
			System.out.println("number is not prime");
		
			}






	}
	
}
