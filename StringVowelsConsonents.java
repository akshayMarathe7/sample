package practicePrograms;

import java.util.ArrayList;

public class StringVowelsConsonents {

	public static void main(String[] args) {
		//
		String name = "akshay";
		char namechar[] = name.toCharArray();

		ArrayList<Character> ls = new ArrayList<>();

		ls.add('a');
		ls.add('e');
		ls.add('i');
		ls.add('o');
		ls.add('u');

		ls.contains("i");

		for (int i = 0; i < namechar.length; i++) {
			if (ls.contains(namechar[i])) {
				System.out.println("vowel found- " + namechar[i]);

			} else {
				System.out.println("consonent " + namechar[i]);
			}

		}

	}

}
