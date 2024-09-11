package collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class LengthComparator implements Comparator<String> {
  @Override
  public int compare(String arg1, String arg2) {
    return Integer.compare(arg1.length(), arg2.length());
  }
}

public class QueueRunner {
  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>(new LengthComparator());

    System.out.println(queue.poll());  //null

    queue.offer("first");
    System.out.println(queue.poll());  //first

    queue.addAll(List.of("Zebra","Monkey","Cat"));

    System.out.println(queue.poll());  // Cat
    System.out.println(queue.poll());  // Zebra
    System.out.println(queue.poll());  // Monkey
  }

}

