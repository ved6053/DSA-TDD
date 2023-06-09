package interview;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Accolite2Test {
	Accolite2 obj = new Accolite2();
	
	@Test
	void findMissingNumber(){
		int[] arr ={1,2,3,4,5,6,8,9,10};
		int n=10;
		Assertions.assertEquals(7, obj.findMissingNumber(arr, n));
	}
	
	@Test
    void arrange(){
		int[] arr ={0,1,2,2,1,1,0};
		obj.arrangeArr(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	

	
}
