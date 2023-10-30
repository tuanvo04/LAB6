package task2;

public class SinglyLinkedList<E> {
	
	    private Node<E> head = null;
	    private Node<E> tail = null;
	    private int size;

	    public SinglyLinkedList() {
	        super();
	        size = 0;
	    }

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public E first() {
	        if (isEmpty()) {
	            return null; // or throw an exception
	        }
	        return head.getElement();
	    }

	    public E last() {
	        if (isEmpty()) {
	            return null; // or throw an exception
	        }
	        return tail.getElement();
	    }

	    public void addFirst(E e) {
	        head = new Node<>(e, head);
	        if (isEmpty()) {
	            tail = head; // Se a lista estava vazia, o novo elemento é tanto o primeiro quanto o último.
	        }
	        size++;
	    }

	    public void addLast(E e) {
	        Node<E> newNode = new Node<>(e, null);
	        if (isEmpty()) {
	            head = newNode; // Se a lista estava vazia, o novo elemento é tanto o primeiro quanto o último.
	        } else {
	            tail.setNext(newNode);
	        }
	        tail = newNode; // Atualiza a cauda para o novo nó.
	        size++;
	    }

	    public E removeFirst() {
	        if (isEmpty()) {
	            return null; // or throw an exception
	        }
	        E removedElement = head.getElement();
	        head = head.getNext();
	        size--;
	        if (isEmpty()) {
	            tail = null; // Se a lista ficar vazia após a remoção, a cauda também deve ser definida como null.
	        }
	        return removedElement;
	    }
	    
}
