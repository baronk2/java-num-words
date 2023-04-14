/*
Kevin Baron
12/17/12
NumWords
*/

public class KWBaron_NumWords {
	
	public static void main(String[] args) {
		System.out.println(numWords("how    many   words   here?"));
		System.out.println(numWords("to be or not to be, that is the question"));
		System.out.println(numWords("  how  about  merry-go-round     "));
		System.out.println(numWords(" !&$%--$$!!*()   foo_bar_baz   "));
		System.out.println(numWords("x"));
		System.out.println(numWords("     "));
		System.out.println(numWords(""));
	}//eo main
	
	public static int numWords(String line) {
		int words = 0;
		if (line.length() > 0 && line.charAt(0) != ' ') {
			words++;
		}//eo if
		for (int i = 1; i < line.length(); i++) {
			if (line.charAt(i - 1) == ' ' && line.charAt(i) != ' ') {
				words++;
			}//eo if
		}//eo for
		return words;
	}//eo numWords
	
}//eo class