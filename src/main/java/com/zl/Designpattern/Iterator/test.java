package com.zl.Designpattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyCollection<T> {

	private List<T> list = new ArrayList<>();

	public void add(T item) {
		list.add(item);
	}

	public void remove(T item) {
		list.remove(item);
	}

	public Iterator<T> iterator() {
		return new MyIterator(list);
	}

	/**
	 * 自定义迭代器
	 */
	private class MyIterator implements Iterator<T> {

		private List<T> dataSource;

		/**
		 * 当前位置的指针
		 */
		private int curPos;

		public MyIterator(List<T> data) {
			this.dataSource = data;
		}

		@Override
		public boolean hasNext() {
			return curPos < dataSource.size();
		}

		@Override
		public T next() {
			T item = dataSource.get(curPos);
			curPos++;
			return item;
		}
	}
}

class Student {
	private String name = "";

	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class test {

	public static void main(String[] args) {
		MyCollection<Student> collection = new MyCollection<>();
		collection.add(new Student("1111"));
		collection.add(new Student("2222"));
		Iterator<Student> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getName());
		}

	}

}
