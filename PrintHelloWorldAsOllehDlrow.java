package practicePrograms;

public class PrintHelloWorldAsOllehDlrow {

	// hellow world--> wolleh dlrow
	public static void main(String[] args) {

		String name = "hellow world";
	
		String namearr[] = name.split(" ");

		String newName = "";

		for (int i = 0; i < namearr.length; i++) {
			char charArr[] = namearr[i].toCharArray();
			for (int j = charArr.length - 1; j >= 0; j--) {
				newName = newName + charArr[j];

			}
			newName = newName + " ";

		}
		System.out.println(newName);

	}

}




// array sort, largest, min in arrat, Array Reverse, Delete element from Array
// array sum
// string reverse-- "abc"--> "cba"
// Reverse word in a STring
// Count of characters and STrings
// FInd event and odd in a given array-- 10, 15, 16, 25,20
// String upper to lower and lower to upper,   "AbcFDewF"-->> "aBCfdEWf" 
// Vowels and consonants
