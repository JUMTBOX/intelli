package functionalProgramming;

import java.util.List;

public class StreamMethodRunner {

  public static void main(String[] args) {
    List<Integer> list = List.of(3,5,3,8,213,5,45,4,7);

    /* 정렬 */
    List<Integer> result = list.stream().sorted().toList();
    System.out.println("정렬 >>>  "+result.toString());

    /* 중복 제거 */
    List<Integer> result1 = list.stream().distinct().sorted().toList();
    System.out.println("중복제거 >>>  "+result1.toString());

    /* 요소 변환 */
    List<Integer> result2 = list.stream().distinct().map(e -> {
      return (int) Math.pow(e,2);
    }).toList();

    System.out.println("요소 변환 >>> " + result2);
  }
}
