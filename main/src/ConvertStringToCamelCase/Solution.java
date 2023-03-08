package ConvertStringToCamelCase;

import java.lang.StringBuilder;
import java.util.*;
class Solution{

    static String toCamelCase(String s){
        if (s.isEmpty()) return s;
        char[] array = s.toCharArray();
        List<Character> characters = new ArrayList<>();
        characters.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == '_' || array[i - 1] == '-') characters.add(Character.toUpperCase(array[i]));
            else if (array[i] == '_' || array[i] == '-') continue;
            else characters.add(array[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : characters) sb.append(c);
        return sb.toString();
    }
}

/*

SMART APPROACH
class Solution {

  static String toCamelCase(String str){
    String[] words = str.split("[-_]");
    return Arrays.stream(words, 1, words.length)
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
            .reduce(words[0], String::concat);
  }
}
 */
