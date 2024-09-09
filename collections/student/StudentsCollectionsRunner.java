package collections.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescendingStudentComparator implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student2.getId(), student1.getId());
  }
}

class AscendingStudentComparator implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student1.getId(), student2.getId());
  }
}

public class StudentsCollectionsRunner {

  public static void main(String[] args) {
    List<Student> studentList = List.of(new Student(3, "John")
        , new Student(2, "Alice")
        , new Student(1,"Sam"));

    List<Student> arrStudentList = new ArrayList<>(studentList);

    Collections.sort(arrStudentList);
    System.out.println("ASC_SORT_RESULT  >>>>  "   + arrStudentList);

    /* Comparator 정의시 옵션 1 */
    Collections.sort(arrStudentList, new DescendingStudentComparator());
    System.out.println("DESC_SORT_OP1_RESULT  >>>> "  +  arrStudentList);
    /* Comparator 정의시 옵션 2 */
    arrStudentList.sort(new DescendingStudentComparator());
    System.out.println("DESC_SORT_OP2_RESULT  >>>> "  +  arrStudentList);

    arrStudentList.sort(new AscendingStudentComparator());
    System.out.println("ASC_OP2_SORT_RESULT   >>>>  " + arrStudentList);
  }
}
