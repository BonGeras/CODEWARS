package ReverseWords;

import java.util.List;

public class Kata
{
    public static String reverseWords(final String original)
    {
        List<String> words= List.of(original.split("\\s"));
        String reverseWord="";
        for (String w : words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString()+" ";
        }
        return reverseWord.trim();
    }
}


/*

SMART SOLUTION
public class Kata
{
  public static String reverseWords(final String original)
  {
    String[] array = original.split(" ");
    if(array.length == 0) return original;
    int i = 0;
    for(String string : array){
        array[i] = new StringBuilder(string).reverse().toString();
        i++;
    }
    return String.join(" ",array);
  }
}


 */