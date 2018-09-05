package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;

public class LinkedListTest {
	@Test
	public void testSizeOfEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test
	public void testAddingToList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(2, list.size());
	}

	// TODO add remove test
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
