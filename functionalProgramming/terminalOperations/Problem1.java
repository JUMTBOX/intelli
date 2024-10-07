package functionalProgramming.terminalOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {

  public static void main(String[] args) {
    List<Integer> result1 = List.of(1,2,3,4,5,6,7,8,9,10)
        .stream()
        .filter(el-> el%2==0)
        .toList();

    System.out.println(result1);

    List<Integer> result2 = IntStream.range(1,11)
        .map(el-> (int) Math.pow(el,2))
        .boxed()
        .collect(Collectors.toList());

    System.out.println(result2);
  }
}
