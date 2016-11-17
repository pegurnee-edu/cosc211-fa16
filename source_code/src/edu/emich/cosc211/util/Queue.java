package edu.emich.cosc211.util;

public interface Queue<E> {
	boolean offer();

	E poll();

	E peek();

	boolean isEmpty();
	
	void clear();
}
