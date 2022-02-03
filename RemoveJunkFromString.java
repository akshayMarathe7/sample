package practicePrograms;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		String s="!@# test ^&{}+ selenium><? QA akshay";
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
