package functionalProgramming.terminalOperations;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class SystemOutComnsumer implements Consumer<Integer> {
  @Override
  public void accept (Integer num) {
    System.out.println(num);
  };
}

class NumberSquareMapper implements Function<Integer,Integer> {
  @Override
  public Integer apply(Integer num) {
    return num * num;
  }
}
public class BehindTheScene2 {
  public static void main(String[] args) {

    List.of(23,36,48).stream()
        .filter(new EvenNumberPredicate())
        .forEach(new SystemOutComnsumer());

    //    .forEach(e -> System.out.println(e));
    //    Consumer<? super T> action
    //    void accept(T t);

    System.out.println("=========================================");

    List.of(23,43,34,45,36,48).stream()
        .filter(n -> n % 2 == 0)
        .map(new NumberSquareMapper())
        .forEach(System.out::println);
    //    .map(n -> n * n)
    // <R> Stream<R> map (Function <? super T, ? extends R> mapper);
    // R apply (T t);
  }
}
