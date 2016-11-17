package edu.emich.cosc211.util;

/**
 * Stack interface.
 * 
 * @author eddie gurnee
 *
 * @param <E>
 *            type that the items are
 */
public interface Stack<E> {
	/**
	 * Removes the object at the top of this stack and returns that object as
	 * the value of this function.
	 * 
	 * @return the removed top item of the stack
	 */
	E pop();

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param item
	 *            to push on to the stack
	 * @return the item pushed
	 */
	E push(E item);

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 * 
	 * @return the top item of the stack
	 */
	E peek();

	/**
	 * Tests if this stack is empty.
	 * 
	 * @return true if the stack is empty
	 */
	boolean isEmpty();
	
	/**
	 * Removes all items from the stack.
	 * 
	 */
	void clear();

}
