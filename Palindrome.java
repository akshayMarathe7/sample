package practicePrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String name="aba";
		
		String reverse="";
		
		char arr[]=name.toCharArray();
		
		for (int i=arr.length-1;i>=0;i--)
		{
			
			reverse=reverse+ arr[i];
		}
		
		
		System.out.println(reverse);
		
		if(name.equals(reverse))
		{
			
			System.out.println("palindrome");
		}
		
		else
		{
			System.out.println("not");
		}

	}

}
