package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Runner {

  public static void main(String[] args) {
    List<String> list = List.of("apple", "banana", "cherry", "date");

    list.forEach(System.out::println); // Output: apple banana cherry date);
    list.stream().map(String::toUpperCase).forEach(System.out::println);

    ArrayList<String> mutableList = new ArrayList<>(list);
    mutableList.add("fig");
    mutableList.add("grape");
    System.out.println("get메서드  >>>>>>  "+ mutableList.get(2));
    mutableList.remove(2);
    mutableList.forEach(System.out::println);

    LinkedList<String> mutableLinkedList = new LinkedList<>(list);
    mutableLinkedList.add("apple2");
    Vector<String> mutableVector = new Vector<>(list);
    mutableVector.add("kiwi");
  }
}
