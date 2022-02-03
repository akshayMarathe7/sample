package practicePrograms;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		
		String name="aksshhayyak";
		
		char namearr[]= name.toCharArray();
		
		for(int i=0;i<namearr.length;i++)
		{
			
			for(int j=i+1;j<namearr.length;j++)
			{
				
				if(namearr[i]==namearr[j])
				{
					System.out.println("duplicate letter found-" +namearr[i]);
				}
				
			}
		}
	

	}

}
