package practicePrograms;

public class ConverUpperToLowerInString {

	public static void main(String[] args) {
		// akShAy--> AKsHaY

		String name = "akS @hAy";
		char charname[] = name.toCharArray();

		String newName = "";

		for (int i = 0; i < charname.length; i++) {
			if (Character.isUpperCase(charname[i])) {
				newName = newName + Character.toLowerCase(charname[i]);
			} else if (Character.isLowerCase(charname[i])) {
				newName = newName + Character.toUpperCase(charname[i]);
			} 
			else {
				newName = newName + charname[i];
			}

		}
		System.out.println(newName);

	}

}
