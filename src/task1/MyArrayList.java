package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// creates an array of double-size if the array of
	// elements is full
	public void growSize() {
		if (size == elements.length) {
			E[] newElements = (E[]) new Object[elements.length * 2];

			for (int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}

			elements = newElements;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null) {
				return true;
			}
		}
		return false;
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		return elements[i];
	}

	// Replaces the element at index i with e, and
	// returns the replaced element. ∗/
	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}

		E value = elements[i];
		elements[i] = e;
		return value;

	}

	public boolean add(E e) {
		if (size == elements.length) {
			growSize();
		}
		elements[size] = e;
		size++;
		return false; // Indicate that the element was successfully added.
	}

	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}

		if (size == elements.length) {
			growSize();
		}
		for (int j = size; j > i; j--) {
			elements[j] = elements[j - 1];
		}
		elements[i] = e;
	}

	// Removes and returns the element at index i,
	// shifting subsequent elements earlier.
	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size()) {
			throw new IndexOutOfBoundsException("Index is out of bounds");
		}
		E removedElement = elements[i];
		for (int j = i; j < size() - 1; j++) {
			elements[j] = elements[j + 1];

		}
		return removedElement;
	}

	// It is used to clear all elements in the list.
	public void clear() {

		size = 0;
	}
	// It is used to return the index in this list of the last occurrence of the
	// specified element, or -1 if the list does not contain this element.

	public int lastIndexOf(Object o) {

		for (int i = size - 1; i >= 0; i--) {

			if (elements[i].equals(o)) {

				return i;

			}

		}

		return -1;

	}

	// It is used to return an array containing all of the elements in this list in

	// the correct order.

	public E[] toArray() {

		E[] array = (E[]) new Object();

		for (int i = 0; i < size; i++) {

			array[i] = elements[i];

		}

		return array;

	}

	// It is used to return a shallow copy of an ArrayList.

	public MyArrayList<E> clone() {

		MyArrayList<E> cloneList = new MyArrayList<>();
		for (E element : elements) {
			cloneList.add(element);
		}
		return cloneList;
	}

	// It returns true if the list contains the specified element

	public boolean contains(E o) {

		for (int i = 0; i < size; i++) {

			if (elements[i].equals(o)) {

				return true;

			}

		}

		return false;

	}

	// It is used to return the index in this list of the first occurrence of the

	// specified element, or -1 if the List does not contain this element.

	public int indexOf(E o) {

		for (int i = 0; i < size; i++) {

			if (elements[i].equals(o))

				return i;

		}

		return -1;

	}

	// It is used to remove the first occurrence of the specified element.

	public boolean remove(E e) {

		int index = indexOf(e);

		int check = 0;

		for (int i = 0; i < size; i++) {

			if (elements[i].equals(e))

				check++;

			if (elements[i].equals(e) || i == index) {

				break;

			}

		}

		return (check == 1);

	}

	// It is used to sort the elements of the list on the basis of specified

	// comparator.

	public void sort(Comparator<E> c) {

		Arrays.sort(elements, 0, size, c);

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Add elements to the list
		list.add(1);
		list.add(2);
		list.add(3);

		// Check the size of the list
		System.out.println("Size of the list: " + list.size());

		// Add more elements
		list.add(4);
		list.add(5);

		// Check the size again
		System.out.println("Size of the list after adding: " + list.size());

		// method isEmpty
		System.out.println(list.isEmpty());

		// method get
		int element = list.get(1); // Retrieves the element at index 1, which is 2 in this case.
		System.out.println("Element at index 1: " + element);

		// method set
		int element1 = list.set(3, element);
		System.out.println("ouput set" + element1);

		// method boolean add
		boolean result = list.add(42);

		if (result) {
			System.out.println("Element added successfully!");
		} else {
			System.out.println("Failed to add element.");
		}

		list.add(0, 42); // Thêm số 42 vào vị trí đầu tiên
		list.add(1, 56); // Thêm số 56 vào vị trí thứ hai
		list.add(2, 73); // Thêm số 73 vào vị trí thứ ba
		System.out.println("list: " + list);

		// method remove

		int removeValue = list.remove(4);
		System.out.println("remove: " + removeValue);
		System.out.println("mảng sau khi xóa phần tử muốn xóa: " + list);
		
		
		System.out.println("lastIndexOf: " +list.lastIndexOf(1));
		
		// Clone a lista
       

        // Verifique se a lista contém um elemento
        System.out.println("Contains 2: " +list.contains(2));
        System.out.println("Contains 5: " + list.contains(5));

        // Encontre o índice de um elemento
        System.out.println("Index of 1: " +list.indexOf(1));
        System.out.println("Index of 5: " + list.indexOf(5));

        // Remova um elemento
        Integer removed = list.remove(2);
        System.out.println("Removed 2: " + removed);
        System.out.println("List after removing 2: " +list);

        // Classifique a lista usando um comparador
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);
    }



	}


