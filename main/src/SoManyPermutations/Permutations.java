package SoManyPermutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> perms = new HashSet<>();
        int slen = s.length();
        if (slen > 0) {
            // Add the first character from s to the perms set.
            perms.add(Character.toString(s.charAt(0)));
            // Repeat for all additional characters in s.
            for (int i = 1; i < slen; ++i) {
                // Get the next character from s.
                char c = s.charAt(i);
                // For each of the strings currently in perms do the following:
                Set<String> newPerms = new HashSet<>();
                for (String p : perms) {
                    // 1. remove the string
                    int plen = p.length();
                    // 2. Add plen + 1 new strings to newPerms.  Each new string
                    //    consists of the removed string with the character c
                    //    inserted into it at a unique location.
                    for (int k = 0; k <= plen; ++k) {
                        newPerms.add(p.substring(0, k) + c + p.substring(k));
                    }
                }
                perms = newPerms;
            }
        }
        return new ArrayList<>(perms);
    }
}

/*

SMART APPROACH
class Permutations {
  public static List<String> singlePermutations(String s) {
    return Collections2.permutations(List.of(s.split(""))).stream().map(p->String.join("",p)).distinct().toList();
  }
}
 */
