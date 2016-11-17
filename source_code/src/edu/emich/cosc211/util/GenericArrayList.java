package edu.emich.cosc211.util;

/**
 * Maintains an array of items.
 *
 * @author eddie gurnee
 * @version 11/17/16
 *
 * @param <T>
 *            type of objects stored in ArrayList
 */
public class GenericArrayList<T> {
	private final static int DEFAULT_CAPACITY = 10;
	private Object[] items;

	private int size;

	/**
	 * zero argument constructor
	 */
	public GenericArrayList() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Creates a GenericArrayList with a given starting capacity.
	 *
	 * @param initialCapacity
	 *            the starting space
	 */
	public GenericArrayList(int initialCapacity) {
		super();
		this.items = new Object[initialCapacity];
		this.size = 0;
	}

	/**
	 * Adds an element at a given location.
	 *
	 * @param index
	 *            location to add
	 * @param element
	 *            element to add
	 */
	public void add(int index, T element) {
		this.rangeCheckForAdd(index);
		this.ensureCapacity(this.size + 1);

		for (int i = this.size; i > index; i--) {
			this.items[i] = this.items[i - 1];
		}

		this.items[index] = element;

		this.size++;
	}

	/**
	 * Adds an element at the end of the list.
	 *
	 * @param e
	 *            element to add
	 * @return true if the element was successfully added
	 */
	public boolean add(T e) {
		this.add(this.size, e);

		return true;
	}

	/**
	 * Removes all items from the list.
	 */
	public void clear() {
		for (int i = 0; i < this.items.length; i++) {
			this.items[i] = null;
		}

		this.size = 0;
	}

	/**
	 * Checks if the list contains the given item.
	 *
	 * @param o
	 *            object to check for
	 * @return true if the item is contained
	 */
	public boolean contains(Object o) {
		return this.indexOf(o) >= 0;
	}

	/**
	 * Gets the data held at a given element location. Used internally.
	 *
	 * @param index
	 *            location of where the item is held
	 * @return the value required
	 */
	@SuppressWarnings("unchecked")
	private T elementData(int index) {
		return (T) this.items[index];
	}

	/**
	 * Makes sure there is capacity for new items coming in.
	 *
	 * @param minCapacity
	 *            the capacity to check for
	 */
	private void ensureCapacity(int minCapacity) {
		if (this.items.length < minCapacity) {
			Object[] newItems = new Object[this.items.length + DEFAULT_CAPACITY];
			for (int i = 0; i < this.size; i++) {
				newItems[i] = this.items[i];
			}
			this.items = newItems;
		}
	}

	/**
	 * Gets the item stored at a given location.
	 *
	 * @param index
	 *            location of requested item
	 * @return the value of the requested item
	 * @throws IndexOutOfBoundsException
	 *             if the requested location is unavailable
	 */
	public T get(int index) {
		this.rangeCheck(index);

		return this.elementData(index);
	}

	/**
	 * Gets the error message for index error out of bounds.
	 *
	 * @param index
	 *            location requested that is out of bounds
	 * @return string representation of index error
	 */
	private String getIndexErrorMessage(int index) {
		return "Index: " + index + ", size" + this.size;
	}

	/**
	 * Gets the index of a given object.
	 *
	 * @param o
	 *            object to search for
	 * @return the index of given object
	 */
	public int indexOf(Object o) {
		int toReturn = -1;
		for (int i = 0; i < this.size; i++) {
			if (this.items[i].equals(o)) {
				toReturn = i;
				break;
			}
		}
		return toReturn;
	}

	/**
	 * Checks if the list is empty.
	 *
	 * @return true if the list is empty
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}

	/**
	 * Throws an error if the index is unavailable to be accessed.
	 *
	 * @param index
	 *            location to check if accessible
	 */
	private void rangeCheck(int index) {
		if (index >= this.size) {
			throw new IndexOutOfBoundsException(this.getIndexErrorMessage(index));
		}

	}

	/**
	 * Checks if the item is within the range.
	 *
	 * @param index
	 *            location to check
	 */
	private void rangeCheckForAdd(int index) {
		if (index > this.size || index < 0) {
			throw new IndexOutOfBoundsException(this.getIndexErrorMessage(index));
		}
	}

	/**
	 * Removes an element at a given location.
	 *
	 * @param index
	 *            location of item to remove
	 * @return the removed item
	 */
	public T remove(int index) {
		T toReturn = this.elementData(index);

		for (int i = index; i < this.size - 1; i++) {
			this.items[i] = this.items[i + 1];
		}

		this.size--;

		return toReturn;
	}

	/**
	 * Removes an object from the list.
	 *
	 * @param o
	 *            object to remove from the list
	 * @return true if the item was removed
	 */
	public boolean remove(Object o) {
		boolean toReturn = false;
		int index = this.indexOf(o);

		if (index > -1) {
			toReturn = true;
			this.remove(index);
		}

		return toReturn;
	}

	/**
	 * Sets an index to a given value.
	 *
	 * @param index
	 *            requested location to set value
	 * @param element
	 *            value to set
	 * @return the element that was there before
	 */
	public T set(int index, T element) {
		this.rangeCheck(index);

		T toReturn = this.elementData(index);
		this.items[index] = element;
		return toReturn;
	}

	/**
	 * Gets the current size of the ArrayList.
	 *
	 * @return the size of the list
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Removes extra unused array slots.
	 */
	public void trimToSize() {
		Object[] newItems = new Object[this.size];
		for (int i = 0; i < this.size; i++) {
			newItems[i] = this.items[i];
		}
		this.items = newItems;
	}
}
