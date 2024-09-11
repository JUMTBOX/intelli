package collections.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindUniqueChar {

  public static void main(String[] args) {
    List<Character> list = List.of('A','C','B','F','Z','C','B','D');

    Set<Character> treeSet = new TreeSet<>(list);
    Set<Character> linkedHashSet = new LinkedHashSet<>(treeSet);

    System.out.println("TREESET ::: "+treeSet);
    System.out.println("HASHSET ::: "+linkedHashSet);
  }
}
