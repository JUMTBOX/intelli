package collections.practiceSet;

public class WordReversing {

    public static String reverseWordsInSentence(String sentence) {
      if(sentence == null) return "INVALID";

      if(sentence.isEmpty()) return sentence;

      StringBuilder reversed = new StringBuilder();

      for(String word : sentence.split(" ")) {
        StringBuilder reversedWord = new StringBuilder(word);
        reversed.append(" ");
        reversed.append(reversedWord.reverse());
      }

      return reversed.toString().trim();
    }
}
