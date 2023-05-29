package interview;

import java.util.Collections;
import java.util.PriorityQueue;

public class WellsFargo {
/***
 * arr[]={1, 20, -30, 0, 11, 1, 503}
 * k = 3
 * kth smallest
 **/
  static  void findKthSmallest(int[] arr, int k) {
	  if(arr.length<k){
		  return;
	  }
	  PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
	  for(int i=0; i<k;i++) {//k
		  priorityQueue.add(arr[i]);//log(k)
	  }//klogK
	  
	  for(int i =k; i<arr.length;i++) {//n-k
		 if( priorityQueue.peek()>arr[i]){
			 priorityQueue.remove();
			 priorityQueue.add(arr[i]);//logk
		 }
	  }
	  //(n-k)logk
	  //klogk+(n-k)logk= nlogk
	  priorityQueue.forEach(value->{System.out.println(value+", ");});
     }
  
	  public  static void main(String[] args) {
	        int[] arr ={1, 20, -30, 0, 11, 1, 503};
			int k=3;
		  findKthSmallest(arr, k);
	  }
	//String literal ,
//Empolyee name , sal , employee Name who has second
/*
select name from employee as e where sal<(select max(sal) from employee) order by sal desc limit(1)
Employee( id, name , managerId);
Select e.name as employee , m.name as manager from Employee as e inner join Employee as m on e.managerId=m.id;
*/
}
