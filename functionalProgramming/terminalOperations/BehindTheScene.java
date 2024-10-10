package functionalProgramming.terminalOperations;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
  @Override
  public boolean test (Integer num) {
    return num % 2 == 0;
  };
}

public class BehindTheScene {
  /* Functional Interface */
  public static void main(String[] args) {
    //    Stream<T> filter(Predicate<? super T> predicate);
    //    boolean test (T t);
    List.of(23,43,34,45,36,48).stream()
        .filter(n-> n%2==0)
        .forEach(System.out::println);

    List.of(23,43,34,45,36,48).stream()
        .filter(new EvenNumberPredicate())
        .forEach(System.out::println);

    /* 위의 두 코드는 같은 결과를 출력 */
  }
}
