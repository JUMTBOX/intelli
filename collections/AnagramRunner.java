package collections;

public class AnagramRunner {

  public static void main(String[] args) {
    AreAnagram yn = new AreAnagram("Listen","Silent");
    System.out.println(yn.areAnagram());  // true
  }
}

