package functionalProgramming.middleOperations;

import java.util.List;

public class Mission3 {

  public static void main(String[] args) {
    List<String> list = List.of("Apple","Ant","Bat");

    list.stream().forEach(e-> System.out.println(e.length()));
  }
}
