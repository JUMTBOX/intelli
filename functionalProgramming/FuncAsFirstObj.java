package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncAsFirstObj {
  /* 1. Storing functions in variables */
  /* 2. Passing functions to methods */
  /* 3. Returning functions from methods */

  public static void main(String[] args) {
    Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
    Predicate<? super Integer> oddPredicate = n -> n % 2 != 0;

    Function <Integer, Integer> squareMapper = n -> n * n;
    Consumer <? super Integer> consumer = System.out::println;

    List.of(1,2,3,4,5,6).stream()
        .filter(evenPredicate)
        .map(squareMapper)
        .forEach(consumer);
  }
}
