package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
  public static void main(String[] args) {
    Set<Integer> set = Set.of(1,2,3,4,5);

    /* 저장 순서에 상관 X */
    Set<Integer> hashSet = new HashSet<>(set);
    hashSet.add(10);
    hashSet.add(123123);
    System.out.println(hashSet);

    /* 저장 순서에 상관 O */
    Set<Integer> linked = new LinkedHashSet<>(set);
    linked.add(10);
    linked.add(123123);
    System.out.println(linked);

    /* 요소가 정렬된 순서로 저장 */
    Set<Integer> treeSet = new TreeSet<>(set);
    treeSet.add(10);
    treeSet.add(123132);
    treeSet.add(100);
    System.out.println(treeSet);
  }
}
