package Lesson_5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordArray {
    public static void main(String[] args) {
        String[] words = new String[] {
                "кошка", "собака", "кошка", "птица", "рыба",
                "собака", "птица", "хомяк", "черепаха", "кошка",
                "лев", "тигр", "рыба", "слон", "лев",
                "тигр", "кролик", "слон", "хомяк"
        };
        System.out.println("Массив слов: " + Arrays.toString(words)+ "\n");


        List<String> wordsList = Arrays.asList(words);
        Set<String> uniqueWordsSet = new HashSet<>(wordsList);
        String[] uniqueWords = uniqueWordsSet.toArray(new String[0]);


        System.out.println("Уникальные слова: " + Arrays.toString(uniqueWords)+ "\n");
        int uniqueWordCount = uniqueWordsSet.size();
        System.out.println("Количество уникальных слов: " + uniqueWordCount);
    }
}

