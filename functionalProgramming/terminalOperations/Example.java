package functionalProgramming.terminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

  public static void main(String[] args) {
    /* 종단 연산 - 합*/
    Integer sum  = IntStream.range(1,11).reduce(0,Integer::sum);
    System.out.println(sum);

    /* 종단 연산 - 비교 */
    Integer maxVal1 = Stream.of(23,12,34,53).max((a,b)-> Integer.compare(a,b)).get();
    System.out.println(maxVal1);

    Integer maxVal2 = IntStream.range(1,16).max().orElseGet(()->-1);
    System.out.println(maxVal2);

    Integer minVal1 = List.of(23,12,34,53).stream().min((n1,n2)->Integer.compare(n1,n2)).get();
    System.out.println(minVal1);

    Integer minval2 = Stream.of(23,12,34,53).min(Comparator.comparingInt(n -> n)).get();
    System.out.println(minval2);
  }
}
