package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.CircularLinkedList;

public class CircularLinkedListTest {
	@Test
	public void testSizeOfEmptyList() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test
	public void testAddingToList() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(2, list.size());
	}

	@Test
	public void testRotate() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		list.add(20);
		list.rotate();
		assertEquals(3, (int) list.get(0));
		assertEquals(20, (int) list.get(1));
		assertEquals(5, (int) list.get(2));
		assertEquals(3, list.size());
		list.rotate();
		assertEquals(20, (int) list.get(0));
		assertEquals(5, (int) list.get(1));
		assertEquals(3, (int) list.get(2));
	}

	// TODO add remove test
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
