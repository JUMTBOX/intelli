package functionalProgramming;

import java.util.List;

public class MethodReferenceRunner {
  public static <T> void customPrintln (T t) {
    System.out.println("CUSTOM_PRINTLN >>> " + t.toString());
  }
  public static void main(String[] args) {
    List.of("Ant", "Bat","Cat","Dog","Elephant").stream()
        .map(String::length)             //  <-  인스턴스 메서드 참조 방식
        .forEach(MethodReferenceRunner::customPrintln);  //  <-  정적 메서드 참조 방식
  }
}
