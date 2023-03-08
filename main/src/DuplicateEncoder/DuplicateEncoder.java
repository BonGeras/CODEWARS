package DuplicateEncoder;

public class DuplicateEncoder {
    public static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.lastIndexOf(c) == word.indexOf(c)) result.append("(");
            else result.append(")");
        }
        return result.toString();
    }
}

/*

SMART APPROACH
public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}
 */
