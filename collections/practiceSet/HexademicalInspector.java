package collections.practiceSet;

public class HexademicalInspector {

  public String str;

  public HexademicalInspector(String str) {
    this.str = str;
  }

  public boolean isHexadecimalChar(char ch) {
    if (!Character.isDigit(ch)) {
      if (!(('A' <= ch && 'F' >= ch) || ('a' <= ch && 'f' >= ch))) {
        return false;
      }
    }
    return true;
  }

  public boolean isHexadecimal() {
    if (this.str == null || this.str.isEmpty())
      return false;
    char[] strArr = this.str.toCharArray();

    for (char el : strArr) {
      if (!this.isHexadecimalChar(el))
        return false;
    }
    return true;
  }
}