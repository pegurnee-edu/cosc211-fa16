package edu.emich.cosc211.examples.generics;

public class Pair<T>  {
	private T firstItem;
	private T secondItem;

	public Pair() {
		this(null, null);
	}

	public Pair(T firstItem, T secondItem) {
		super();
		this.firstItem = firstItem;
		this.secondItem = secondItem;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (firstItem == null) {
			if (other.firstItem != null)
				return false;
		} else if (!firstItem.equals(other.firstItem))
			return false;
		if (secondItem == null) {
			if (other.secondItem != null)
				return false;
		} else if (!secondItem.equals(other.secondItem))
			return false;
		return true;
	}

	public T getFirstItem() {
		return firstItem;
	}

	public T getSecondItem() {
		return secondItem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstItem == null) ? 0 : firstItem.hashCode());
		result = prime * result + ((secondItem == null) ? 0 : secondItem.hashCode());
		return result;
	}

	public void setFirstItem(T firstItem) {
		this.firstItem = firstItem;
	}

	public void setSecondItem(T secondItem) {
		this.secondItem = secondItem;
	}

	@Override
	public String toString() {
		return "Pair [firstItem=" + firstItem + ", secondItem=" + secondItem + "]";
	}

}
