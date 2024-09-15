package collections;

import java.util.Arrays;

public class AreAnagram {
  private char[] strArr1;
  private char[] strArr2;
  private String str1;
  private String str2;

  public AreAnagram (String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
    this.strArr1 = str1.toLowerCase().toCharArray();
    this.strArr2 = str2.toLowerCase().toCharArray();
  }

  public boolean areAnagram () {
    boolean result = false;
    if(!this.inspection()) return false;

    Arrays.sort(this.strArr1);
    Arrays.sort(this.strArr2);

    if(Arrays.equals(this.strArr1, this.strArr2)) result = true;
    return result;
  }

  public boolean inspection () {
    if(str1.isEmpty() || str2.isEmpty()) return false;

    return str1.length() == str2.length();
  }
}
