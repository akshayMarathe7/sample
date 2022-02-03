package practicePrograms;

public class ReverseStringUsingCharArray {

//	public static void main(String[] args) {
//
//		String sample="akshay marathe"; //6
//		
//		char[] samplechar=sample.toCharArray();
//		String newSample=" ";
//		System.out.println(samplechar.length);
//		
//		for (int i=samplechar.length-1;i>=0;i--)	//5 4 3 2 1 0
//		{
//			 newSample=newSample+samplechar[i];
//		}
//		System.out.println(newSample);

	public static void main(String args[]) {

		String name = "i am pvj";
		char nameArr[] = name.toCharArray();

		String newName = "";
		
		for (int i = nameArr.length - 1; i >= 0; i--) {
			newName = newName + nameArr[i];

		}
		System.out.println(newName);

// second way		

//		StringBuffer sb= new StringBuffer(sample);
//		System.out.println(sb.reverse());

	}

}
