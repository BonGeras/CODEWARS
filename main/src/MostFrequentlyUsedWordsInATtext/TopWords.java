package MostFrequentlyUsedWordsInATtext;

import java.util.*;

public class TopWords {
    public static List<String> top3(String s) {
        Map<String, Integer> wordCounts = new HashMap<>();
        s = s.replaceAll("[^a-zA-Z']", " ");
        String[] words = s.toLowerCase().split("\\s+");
        for (String word : words) {
            if (word.matches(".*[a-zA-Z].*")) wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        List<String> sortedWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sortedWords, (a, b) -> wordCounts.get(b).compareTo(wordCounts.get(a)));
        return sortedWords.subList(0, Math.min(3, sortedWords.size()));
    }
}
