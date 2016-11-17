package edu.emich.cosc211.util;

public class GenericLinkedList<T> {
	private class GenericLinkedListNode {
		T data;
		GenericLinkedListNode next;

		public GenericLinkedListNode(T data, GenericLinkedListNode next) {
			this.data = data;
			this.next = next;
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
			this.head = new GenericLinkedListNode(elem, null);
		} else {
			GenericLinkedListNode node = head;

			// TODO: what is happening here?
			while (node.next != null) {
				node = node.next;
			}
			node.next = new GenericLinkedListNode(elem, null);
		}
		size++;
		return true;
	}

	public int size() {
		return this.size;
	}

	public T get(int index) {
		GenericLinkedListNode node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.data;
	}

}
