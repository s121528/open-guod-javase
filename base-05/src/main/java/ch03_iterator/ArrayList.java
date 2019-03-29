package ch03_iterator;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2018/8/4 时间:12:37
 * @JDK 1.8
 * @Description 功能模块：
 */
public class ArrayList implements Collection {
	Object[] array = new Object[10];
	int index = 0;

	@Override
	public void add(Object o) {
		if (index == array.length) {
			// 数组扩容
			Object[] newArray = new Object[array.length * 2];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		array[index] = o;
		index++;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new Ite();
	}

	private class Ite implements Iterator {
		private int currentIndex = 0;

		@Override
		public Object next() {
			Object o = array[currentIndex];
			currentIndex++;
			return o;
		}

		@Override
		public boolean hasNext() {
			if (currentIndex >= index) {
				return false;
			} else {
				return true;
			}
		}
	}
}
