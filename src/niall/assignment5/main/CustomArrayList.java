package niall.assignment5.main;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {

		Object[] tempArray = new Object[(items.length) * 2];
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				return true;
			}
			if (items[items.length - 1] != null) {
				for (int j = 0; j < items.length; j++) {
					tempArray[j] = items[j];
					tempArray[j + 1] = item;
				}
				items = tempArray;
				return true;
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Object object : items) {
			if (object != null) {
				size++;
			}
		}
		return size;
	}

	@Override
	public T get(int index) {
		T T = null;
		for (int i = 0; i < items.length; i++) {
			if (i == index)
				T = (T) items[i];
		}
		return T;
	}

}
