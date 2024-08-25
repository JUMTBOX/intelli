package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

  public static void main(String[] args) {
    List<String> list = List.of("apple", "banana", "cherry", "date");
    ArrayList<String> arrayList = new ArrayList<>(list);

    /* List는 중복된 요소를 가질 수 있다. */
    arrayList.add(2, "date");

    /* addAll 메서드 , arg1 - 요소들을 삽입할 인덱스, arg2 - 삽입할 요소들의 collection */
    List<String> newlist = List.of("yak", "zebra");
    arrayList.addAll(2, newlist);

    /* set 메서드 - 특정 인덱스의 요소만을 변경 */
    arrayList.set(0, "dpple");

    /* remove 메서드  -  특정 인덱스나 값을 받아 해당 요소를 삭제 */
    arrayList.remove(0);
    arrayList.remove("date");

    /* 순회법 1 */
    for(int i=0; i<arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }

    /* 순회 법 2 */
    Iterator<String> iterator = arrayList.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    /* 순회법 3 */
    for(String item : arrayList) {
      System.out.println(item);
    }

    //    arrayList.forEach(System.out::println);
  }
}
