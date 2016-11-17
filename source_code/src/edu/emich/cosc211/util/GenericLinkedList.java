package edu.emich.cosc211.util;

public class GenericLinkedList<T> {
	/**
	 * Inner class to track individual data nodes.
	 * 
	 * @author eddie gurnee
	 *
	 */
	private class GenericLinkedListNode {
		T data;
		GenericLinkedListNode next;

		public GenericLinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

	private GenericLinkedListNode head;
	private int size;

	public GenericLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public boolean add(T elem) {
		if (null == head) {
			this.head = new GenericLinkedListNode(elem);
		} else {
			GenericLinkedListNode node = head;

			// TODO: what is happening here?
			while (node.next != null) {
				node = node.next;
			}
			node.next = new GenericLinkedListNode(elem);
		}
		size++;
		return true;
	}

	public int size() {
		return this.size;
	}

	/**
	 * Returns the specific element at a requested index.
	 * 
	 * @param index
	 * @return
	 */
	public T get(int index) {
		GenericLinkedListNode node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.data;
	}

	//TODO: clear
	//TODO: add(int index, T element)
	//TODO: contains(T element)
	//TODO: indexOf(T element)
	//TODO: isEmpty()
	//TODO: remove(int index)
	//TODO: remove(T element)
	//TODO: set(int index, T element)
	//TODO: size()
}
