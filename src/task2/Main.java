package task2;

public class Main {
	 public static void main(String[] args) {
	        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

	        // Adicionar elementos no início e no final
	        myList.addFirst(1);
	        myList.addFirst(2);
	        myList.addLast(3);
	        myList.addLast(4);

	        // Exibir o tamanho da lista
	        System.out.println("Tamanho da lista: " + myList.size());

	        // Verificar se a lista está vazia
	        System.out.println("A lista está vazia? " + myList.isEmpty());

	        // Acessar o primeiro e último elemento
	        System.out.println("Primeiro elemento: " + myList.first());
	        System.out.println("Último elemento: " + myList.last());

	        // Remover o primeiro elemento
	        System.out.println("Removido primeiro elemento: " + myList.removeFirst());
	        System.out.println("Novo tamanho da lista: " + myList.size());

	        // Exibir o primeiro elemento após a remoção
	        System.out.println("Primeiro elemento após a remoção: " + myList.first());
	    }
	}

