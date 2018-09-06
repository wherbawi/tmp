package edu.bu.datastructures.list;

public class LinkedList<T> implements List<T> {
	Node<T> head;
	Node<T> tail;
	private int size;

	public LinkedList() {
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO check if i<0 or i>=size--> throw exception
		T data = getData(i);
		return data;
	}

	public void set(int i, T x) {
		// TODO: impelement the set method and its test cases
	}

	public void add(int index, T x) {
		// TODO check if dataIndex is valid
		Node<T> newNode = new Node<T>();
		newNode.data = x;

		if (index == 0) {
			addFirstPositionNode(newNode);
			return;
		}

		int i = 0;
		Node<T> currNode = head;
		while (i != index - 1) {
			currNode = currNode.next;
			i++;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		size++;

	}

	public void add(T x) {
		Node<T> newNode = new Node<T>();
		newNode.data = x;
		newNode.next = null;
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public T remove(int i) {
		// TODO implement the remove method and its test case
		return null;
	}

	public int getSize() {
		return size;
	}

	private T getData(int index) {
		int i = 0;
		Node<T> currData = head;
		while (i != index) {
			currData = currData.next;
			i++;
		}

		return currData.data;
	}

	private void addFirstPositionNode(Node<T> newNode) {
		newNode.next = head;
		head = newNode;
		size++;
	}

	private class Node<T> {
		T data;
		Node<T> next;
	}
}
