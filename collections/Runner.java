package collections;

import java.util.*;

public class Runner {

  public static void main(String[] args) {
    List<String> list = List.of("apple", "banana", "cherry", "date");

    list.forEach(System.out::println); // Output: apple banana cherry date);
  }
}
