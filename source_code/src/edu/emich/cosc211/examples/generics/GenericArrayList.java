package edu.emich.cosc211.examples.generics;
public class GenericArrayList<T> {
	private Object[] items;
	private int size;

	private final static int DEFAULT_CAPACITY = 10;

	public GenericArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public GenericArrayList(int initialCapacity) {
		super();
		this.items = new Object[initialCapacity];
		this.size = 0;
	}

	public void add(int index, T element) {
		rangeCheck(index);
		ensureCapacity(size + 1);

		for (int i = this.size; i > index + 1; i--) {
			this.items[i] = this.items[i - 1];
		}

		this.items[index] = element;

		this.size++;
	}

	public void trimToSize() {
		Object[] newItems = new Object[this.size];
		for (int i = 0; i < this.size; i++) {
			newItems[i] = this.items[i];
		}
		this.items = newItems;
	}

	private void ensureCapacity(int minCapacity) {
		if (this.items.length < minCapacity) {
			Object[] newItems = new Object[this.items.length + DEFAULT_CAPACITY];
			for (int i = 0; i < this.size; i++) {
				newItems[i] = this.items[i];
			}
			this.items = newItems;
		}
	}

	private void rangeCheck(int index) {
		if (index > this.size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", size" + size);
		}
	}

	public boolean add(T e) {
		this.add(this.size, e);
		return true;
	}

	public void clear() {
		for (int i = 0; i < items.length; i++) {
			items[i] = null;
		}

		this.size = 0;
	}

	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	public T get(int index) {
		rangeCheck(index);

		return elementData(index);
	}

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

	public boolean isEmpty() {
		return this.size == 0;
	}

	public T remove(int index) {
		T toReturn = elementData(index);

		for (int i = index; i < this.size - 1; i++) {
			this.items[i] = this.items[i + 1];
		}

		this.size--;

		return toReturn;
	}

	@SuppressWarnings("unchecked")
	private T elementData(int index) {
		return (T) this.items[index];
	}

	public boolean remove(Object o) {
		boolean toReturn = false;
		int index = this.indexOf(o);

		if (index > -1) {
			toReturn = true;
			this.remove(index);
		}

		return toReturn;
	}

	public T set(int index, T element) {
		rangeCheck(index);

		T toReturn = elementData(index);
		this.items[index] = element;
		return toReturn;
	}

	public int size() {
		return size;
	}
}
