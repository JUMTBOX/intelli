package functionalProgramming.middleOperations;

import java.util.List;

public class Mission1 {

  public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

    String result = list.stream().map(e-> (int)Math.pow(e,2)).toList().toString();
    System.out.println(result);
  }
}
