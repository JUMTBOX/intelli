package collections.student;

public class Student implements Comparable<Student> {
  private int id;
  private String name;

  Student (int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Student [id=%s, name=%s]", id, name);
  }
  @Override
  public int compareTo(Student that) {
    return Integer.compare(this.id ,that.id);
  }
}
