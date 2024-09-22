package functionalProgramming.middleOperations;

import java.util.stream.IntStream;

public class Mission1 {

  public static void main(String[] args) {
    String result = IntStream.range(1,10).map(e->(int)Math.pow(e,2)).boxed().toList().toString();
    System.out.println(result);
  }
}
