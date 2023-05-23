package dsa.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {

	private  static MiddleOfTheLinkedList<Integer> middleOfTheLinkedList;
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeAll
	public static void setMiddleOfTheLinkedList(){
		middleOfTheLinkedList = new MiddleOfTheLinkedList<>();
	}
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

   @Test
   /**
   * Input: head = [1,2,3,4,5]
   * Output: [3,4,5]
   * Explanation: The middle node of the list is node 3.
   **/
   void whenTestCase1_then_call_middleOfTheLinkedList() {
	   ListNode<Integer> head = new ListNode<>(1);
	   head.next = new ListNode<>(2);
	   head.next.next = new ListNode<>(3);
	   head.next.next.next = new ListNode<>(4);
	   head.next.next.next.next = new ListNode<>(5);
		
	   middleOfTheLinkedList.print(middleOfTheLinkedList.findMiddleElementOfLinkedList(head));
	   assertEquals("[3,4,5]", outputStreamCaptor.toString()
			                             .trim());
    }

  /**
   * Input: head = [1,2,3,4,5,6]
   * Output: [4,5,6]
   * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
   **/
    @Test
    void whenTestCase2_then_call_middleOfTheLinkedList() {
	  ListNode<Integer> head = new ListNode<>(1);
	  head.next = new ListNode<>(2);
	  head.next.next = new ListNode<>(3);
	  head.next.next.next = new ListNode<>(4);
	  head.next.next.next.next = new ListNode<>(5);
	  head.next.next.next.next.next = new ListNode<>(6);
	  middleOfTheLinkedList.print(middleOfTheLinkedList.findMiddleElementOfLinkedList(head));
	  assertEquals("[4,5,6]", outputStreamCaptor.toString()
			                          .trim());
	}
	@AfterEach
	public void restoreStreams() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
}
