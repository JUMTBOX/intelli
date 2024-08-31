package collections;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

  public static void main(String[] args) {
    // 리스트에 저장되는 원시자료형 요소들은 모두 auto boxing 된다.
    // 그래서 변수의 타입 지정시 List<int> , List<char>, List<boolean> 이딴게 안되는 것임
    List list = List.of("A", 'A', 1, 1.0);

    boolean yn1 = list.get(2) instanceof Integer;
    boolean yn2 =  list.get(1) instanceof Character;
    boolean yn3 = list.get(3) instanceof Double;

//    System.out.println("result >>>>>  " + yn1);  // true (int)
//    System.out.println("result >>>>>  " + yn2);  // true (char)
//    System.out.println("result >>>>>  " + yn3);  // true (boolean)
    List<Integer> intList = List.of(101, 102, 103);
    List<Integer> arrayList = new ArrayList<>(intList);

    arrayList.indexOf(101);
    try {
      arrayList.remove(101);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println(arrayList.remove(Integer.valueOf(101)));
    System.out.println(arrayList);
  }

}
