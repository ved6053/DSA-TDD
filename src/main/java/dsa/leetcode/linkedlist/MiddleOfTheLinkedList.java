package dsa.leetcode.linkedlist;

import java.util.Objects;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/955604319/
 * https://www.youtube.com/watch?v=NbXOtYHaMr0&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=13
 */
public class MiddleOfTheLinkedList<E> {
  public ListNode<E> findMiddleElementOfLinkedList(ListNode<E> head) {
    ListNode<E> fast, slow;
    fast = slow = head;
    while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public void print(ListNode<E> head) {
    System.out.print("[");
    while (Objects.nonNull(head)) {
      System.out.print(head.data);
      if (Objects.nonNull(head.next)) {
        System.out.print(",");
      }
      head = head.next;
    }
    System.out.print("]");
  }
}
