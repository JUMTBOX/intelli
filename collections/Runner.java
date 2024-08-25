package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Runner {

  public static void main(String[] args) {
    /* List의 정적메서드 of 만든 list는 불변 List이다. */
    List<String> list = List.of("apple", "banana", "cherry", "date");

    list.forEach(System.out::println); // Output: apple banana cherry date);
    list.stream().map(String::toUpperCase).forEach(System.out::println);

    ArrayList<String> mutableList = new ArrayList<>(list);
    mutableList.add("fig");
    mutableList.add("grape");
    System.out.println("get메서드  >>>>>>  "+ mutableList.get(2));
    mutableList.remove(2);
    mutableList.forEach(System.out::println);

    /* LinkedList
    *  인덱스가 없기 때문에 특정 요소에 접근할 때 비용이 높다. ArrayList 는 요소 접근에는 효율 적임
    *  반면 요소의 삽입 이나 삭제에 드는 비용이 ArrayList 보다 효율적 이다.
    * */
    LinkedList<String> mutableLinkedList = new LinkedList<>(list);
    mutableLinkedList.add("apple2");

    /* vector
    * thread safe : 여러개의 스레드에서 동시에 사용하지 못하게 method에 synchronized 키워드가 붙어있음
    * 성능 문제가 발생할 수 있음.. 현재 사용하고 있는 스레드에서의 처리가 끝난 이후 접근 할 수 있기 때문
    * */
    Vector<String> mutableVector = new Vector<>(list);
    mutableVector.add("kiwi");
  }
}
