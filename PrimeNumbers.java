package practicePrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num=9;
		boolean flag=true;

		for (int i = 2; i <num; i++)
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		
		
		if(flag)
		{
			System.out.println("number is Prime");
		}
		else
		{
			System.out.println("number is not prime");
		}

	}
}
