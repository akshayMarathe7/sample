package practicePrograms;

public class FiboSeries {

	public static void main(String[] args) {
		
		int a=1;
		int b=1;
		int k=0;
		
		System.out.print(a+ " " +b+ " " );
		
		for (int i=0;i<10;i++)  //
		{
			k=a+b;  // k=1+1
			System.out.print(k +" ");    // 2
			a=b;
			b=k;
			
			
		}
		System.out.println(" ");
		
		fib();
	}
	
	
	
	
	public static void fib()
	{
		
		int x=1;
		int y=1;
		int z=0;
		System.out.print(" "+x+ " " +y);
		
		for (int i=0;i<15;i++)
		{
			
			z=x+y;
			System.out.print(" "+z+" ");
			x=y;
			y=z;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
