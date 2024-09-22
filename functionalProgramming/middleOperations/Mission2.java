package functionalProgramming.middleOperations;

import java.util.List;

public class Mission2 {

  public static void main(String[] args) {
    List<String> list = List.of("Apple","Ant","Bat");

    String result = list.stream().map(String::toLowerCase).toList().toString();
    System.out.println(result);
  }
}
