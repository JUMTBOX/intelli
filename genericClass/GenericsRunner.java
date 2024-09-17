package genericClass;

import java.util.List;

public class GenericsRunner {

  /* ???? 제네릭 메서드 */
  static <X extends List> void doSomeThing (X list) {
    System.out.println("doSomeThing!!    >>>>  "+ list.toString());
  }

  /* 제네릭  상한경계 와일드카드*/
  static Number sumOfNumberList(List<? extends Number> numbers){
     double sum = 0.0;
     for(Number num : numbers) {
       sum += num.doubleValue();
     }
     return sum;
  }
  /* 하한경계 와일드카드 */
  static void addACoupleOfValues(List<? super Number> numbers) {
    numbers.add(1);
    numbers.add(1.0);
    numbers.add(1.0f);
    numbers.add(1l);
  }
  public static void main(String[] args) {
    CustomList<String> list = new CustomList<>();
    list.addElement("Element 1");
    list.addElement("Element 2");

    System.out.println("idx0 elem  >>>> " + list.get(0));
    System.out.println("list    >>>>>>>  " + list.toString());

    CustomList<Integer> list2 = new CustomList<>();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));

    System.out.println("idx 1 elem  >>>>  " + list2.get(1));
    System.out.println("list2    >>>>>>>  " + list2.toString());
  }
}
