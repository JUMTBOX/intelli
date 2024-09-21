package functionalProgramming;

import java.util.List;

public class FPNumberRunner {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(4,6,8,13,3,15);

    int result = FPSum(numbers);
    System.out.println(result);
  }

  private static Integer FPSum (List<Integer> list) {
    return list.stream().reduce(0,(acc,cur)-> acc + cur);
  }
  /* keyword 중간연산 / 종단연산 */
}
