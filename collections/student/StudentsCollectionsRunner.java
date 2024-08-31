package collections.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionsRunner {

  public static void main(String[] args) {
    List<Student> studentList = List.of(new Student(3, "John")
        , new Student(2, "Alice")
        , new Student(1,"Sam"));

    List<Student> arrStudentList = new ArrayList<>(studentList);
    Collections.sort(arrStudentList);
    System.out.println("   result    >>>>   "   + arrStudentList);
  }
}
