package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

  public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5);

    printWithFP(list);
  }

  private static void printBasic(List<String> list) {
    for(String string: list) {
      System.out.println(string);
    }
  }

  private static <T> void printWithFP(List<T> list) {
    list.stream().forEach(item -> {
      System.out.println(item);
    });
  }
}
