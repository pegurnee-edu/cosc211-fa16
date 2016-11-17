package edu.emich.cosc211.util;

/**
 * Queue interface.
 * 
 * @author eddie gurnee
 *
 * @param <E>
 *            type that the items are
 */
public interface Queue<E> {
	/**
	 * Adds an item to the back of the queue.
	 * 
	 * @param item
	 *            to added to the queue
	 * @return true if the item was added successfully
	 */
	boolean offer(E item);

	/**
	 * Removes the object at the front of this queue and returns that object as
	 * the value of this function.
	 * 
	 * @return the removed front item of the queue
	 */
	E poll();

	/**
	 * Looks at the object at the front of the queue without removing it from
	 * the queue.
	 * 
	 * @return the top item of the queue
	 */
	E peek();

	/**
	 * Tests if this queue is empty.
	 * 
	 * @return true if the queue is empty
	 */
	boolean isEmpty();

	/**
	 * Removes all items from the queue.
	 * 
	 */
	void clear();
}
