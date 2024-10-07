package functionalProgramming.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

  public static void main(String[] args) {
    Optional<Integer> maxValOp = List.of(23,45,67,12).stream().filter(n->n%2==0).max(Comparator.comparingInt(n->n));

    System.out.println(maxValOp.orElse(0));
  }
}
