package genericClass;

import java.util.ArrayList;

public class CustomList<T> {
  ArrayList<T> list = new ArrayList<>();

  public void addElement (T element) {
    list.add(element);
  }

  public void removeElement (T element) {
    list.remove(element);
  }

  public T get (int idx) {
    return list.get(idx);
  }

  @Override
  public String toString() {
    return list.toString();
  }
}
