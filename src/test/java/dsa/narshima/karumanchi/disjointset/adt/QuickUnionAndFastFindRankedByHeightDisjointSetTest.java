package dsa.narshima.karumanchi.disjointset.adt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.rmi.NoSuchObjectException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickUnionAndFastFindRankedByHeightDisjointSetTest {
	DisjointSet<Integer> disjointSet;

	@BeforeEach
	void initialize(){
		Integer[] setArray = {3, 5, 8, 9, 7, 2};
		disjointSet = new  QuickUnionAndFastFindRankedByHeightDisjointSet(setArray);
	}
	
	@Test
	void makeSet(){
		try {
			disjointSet.makeSet(1);
			assertEquals(1 ,disjointSet.find(1) );
		} catch ( NoSuchObjectException ex){
			fail(ex.getMessage());
		}
	}
	
	@Test
	void union() {
		try {
			disjointSet.union(8, 2); //2(-2)<-8(-1)
			disjointSet.union(7, 9);// 9(-2)<-7(-1)
			disjointSet.union(7, 5);
											// 9(-3)
											// <- 7(-1)
											// <-5(-1)
			disjointSet.union(2, 5);
										// 9(-3)
										// <- 7(-1)
										// <-5(-1)
										// <- 2(-2)
										//      <-8(-1)
										
			
			assertEquals(9 ,disjointSet.find(2) );
		} catch ( NoSuchObjectException ex){
			fail(ex.getMessage());
		}
	}
	
	@Test
	void whenElementXNotFound_then_union() {
		try {
			disjointSet.union(1 ,2);
		} catch ( NoSuchObjectException ex){
			assertEquals("Element{" + "data=" + 1 + "} is not present in DisjointSet", ex.getMessage());
		}
	}
	
	@Test
	void whenElementYNotFound_then_union() {
		try {
			disjointSet.union(8 ,10);
		} catch ( NoSuchObjectException ex){
			assertEquals("Element{" + "data=" + 10 + "} is not present in DisjointSet", ex.getMessage());
		}
	}
	
	@Test
	void find() {
		try {
			assertEquals(5 ,disjointSet.find(5));
		} catch ( NoSuchObjectException ex){
			fail(ex.getMessage());
		}
	}
	@Test
	void whenElementNotPresentInDisjointSet_then_find() {
		try {
			disjointSet.find(1);
		} catch ( NoSuchObjectException ex){
			assertEquals("Element{" + "data=" + 1 + "} is not present in DisjointSet", ex.getMessage());
		}
	}
}
