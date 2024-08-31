package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

  public static void main(String[] args) {
    List<Integer> list = List.of(1,10,23,55,44,23,5);
    List<Integer> arrList = new ArrayList<>(list);

    Collections.sort(arrList);

    System.out.println("----------"  + arrList);

  }
}
