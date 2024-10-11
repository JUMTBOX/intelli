package functionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestRunner {

  public static void main(String[] args) {
//    getCubesOfFirstNNumbers(5).forEach(System.out::println);
  }


  public static List<Integer> getCubesOfFirstNNumbers(int n) {
    if(n <= 0) return new ArrayList<Integer>();

    return IntStream.range(1,n).map(el -> el * el * el).boxed().collect(Collectors.toList());
  }

  public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
    if(courses==null || courses.isEmpty()) return new ArrayList<Integer> ();

    Function<String, Integer> mapper = String::length;

    return courses.stream().map(mapper).collect(Collectors.toList());
  }

  public static long sumOfSquares(List<Integer> numbers) {
    if(numbers==null||numbers.isEmpty()) return 0;

    ToLongFunction<? super Integer> mapper = (n) -> (long) n * n;
    return numbers.stream().mapToLong(mapper).sum();
  }

  public static int findMaxEvenNumber(List<Integer> numbers) {
    if(numbers==null) return 0;

    Predicate<Integer> predicate = n -> n % 2 == 0;
    Comparator<Integer> comparator = Integer::compare;

    return numbers.stream().filter(predicate).max(comparator).orElseGet(()->0);
  }
}
