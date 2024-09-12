package collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharInSentence {

  public static void main(String[] args) {
    String str = "This is an awesome occasion. This has never happend before.";
    Map<Character,Integer> counter1 = new HashMap<>();
    Map<String,Integer> counter2 = new TreeMap<>();

    /* 방법 1 */
    char[] charArr = str.toCharArray();
    for(char spell: charArr) {
      Integer integer = counter1.get(spell);
      if(spell!= ' '&& spell!='.'){
        if(integer == null) {
          counter1.put(spell,1);
        } else {
          counter1.put(spell,integer+1);
        }
      }

      /* 방법 3 */
      //counter1.merge(spell, 1, Integer::sum);
    }
    System.out.println(counter1);

    /* 방법 2 */
    Arrays.stream(str.replaceAll(" ","").replace(".","").split("")).forEach(spell ->{
      Integer num = counter2.get(spell);
      if(counter2.containsKey(spell)) {
        counter2.put(spell, num + 1);
      } else {
        counter2.put(spell, 1);
      }
    });
    System.out.println(counter2);
  }
}
