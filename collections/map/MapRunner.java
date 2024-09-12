package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

  public static void main(String[] args) {
    Map<String,Integer> map = Map.of("A",3,"B",5,"Z",10);
    map.get("A"); //3
    map.containsKey("B"); // true
    map.isEmpty(); //false
    map.containsValue(10);  // true
    map.keySet(); // [B, A, Z]
    map.values(); // [10, 3, 5]
    System.out.println(map.values());

    Map<String,Integer> hashMap = new HashMap<>(map);
    /* put은 키의 이전 값을 반환 */
    hashMap.put("C",7);  // "C"키 최초 입력이니 null 반환
    hashMap.put("Z",11); // "Z"키가 가지고 있던 값 10 반환
    System.out.println(hashMap);
  }
}
