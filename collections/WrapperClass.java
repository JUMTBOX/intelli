package collections;

import java.util.List;

public class WrapperClass {

  public static void main(String[] args) {
    // 리스트에 저장되는 원시자료형 요소들은 모두 auto boxing 된다.
    List list = List.of("A", 'A', 1, 1.0);

    boolean yn1 = list.get(2) instanceof Integer;
    boolean yn2 =  list.get(1) instanceof Character;
    boolean yn3 = list.get(3) instanceof Double;

    System.out.println("result >>>>>  " + yn1);
    System.out.println("result >>>>>  " + yn2);
    System.out.println("result >>>>>  " + yn3);
  }

}
