package practicePrograms;

public class ReverseArrayNew {

	public static void main(String[] args) {
	
		int arr[]= {10,20,30,50,1};
		
		int newarr[]=new int[arr.length];
		
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			newarr[j]=arr[i];
			j++;
		}
		
		for(int k=0;k<newarr.length;k++)
		{
			System.out.print(newarr[k]+" ");
		}

	}

}
