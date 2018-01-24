import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccur {
	 static char countChar(String s) {
	    if (s == null || s.length() == 0) return 0;
	    char maxValue = '\u0000';

	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for (char c : s.toCharArray()) {
	        if (Character.isLetter(c)) {
	            c = Character.toLowerCase(c);
	            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
	            else map.put(c, 1);
	        }
	    }

	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	        if (maxValue == '\u0000') maxValue = entry.getKey();
	        if (map.get(maxValue) < entry.getValue()) {
	            maxValue = entry.getKey();
	        }
	    }
	    return maxValue;
	}
	static void inputText(){
		System.out.printf("Enter any word:\n");
		Scanner scr = new Scanner(System.in);
		String input = scr.nextLine().replaceAll("\\s", "");
		scr.close();
		System.out.printf("Result: %s\n",countChar(input));
	}

	public static void main(String[] args) {
		new CharOccur().inputText();
		

	}

}
