package DetectPangram;

public class PangramChecker {
    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent) return true;
        else return false;
    }
}


/*

SMART APPROACH
public class PangramChecker {
  public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

  }
}
 */