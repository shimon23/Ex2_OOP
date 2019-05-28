package Q3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Shimon and zohar
 * DoublyLinkedList is a generic LinkedList 
 * @param <E>
 */
public class DoublyLinkedList<T> {
    /**
     * 
     *Node<E> is a DoublyLinkedList<T> inner class
     *
     * @param <E>
     */
	class Node <E>{

		private E data;
		private Node <E> previous;
		private Node <E> next;
		
		/**
		 * Default contractor
		 */
		Node(){
			this.previous=null;
			this.next=null;
			this.data=null;
		}
		/**
		 * generic contractor that get data
		 * @param data
		 */
		Node(E data) { 
			this.data = data; 

		}
		/**
		 * @return the previous Node
		 */
		public Node<E> previous() { 
			return this.previous; 
		}
		/**
		 * @return the next Node
		 */

		public Node<E> next() { 
			return this.next; 
		}
		/**
		 * @return the Content of the Node
		 */
		public E getContent() { 
			return this.data; 
		}
		/**
		 * set the Previous
		 * @param Previous
		 */

		public void setPrevious(Node<E> previous) { 
			this.previous = previous; 
		}
		/**
		 * set the next
		 * @param next
		 */
		public void setNext(Node<E> next) { 
			this.next = next; 
		}

		public String toString() { 
			return data.toString(); 
		}
	}


	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public Node<T> head() { 
		return this.head;
	}

	public Node<T> tail() {
		return this.tail; 
	}

	public void add(T element) {
		Node<T> newNode = new Node<T>(element);
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			this.tail = newNode;
		}
		this.size++;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			stringBuilder.append(currentNode.getContent()).append(" ");
			currentNode = currentNode.next();
		}
		System.out.println(stringBuilder.toString().trim());
		return stringBuilder.toString().trim();
	}

	public ListIterator<T> listIterator() {

		return new ListIterator<T>() {
			Node<T>  curr=null;
			boolean flag = false;

			public boolean hasNext() {
				if(curr==null&&!flag) {
					curr=head;
					flag = true;
				}
				return curr!= null;
			}

			public T next() {
				T element = curr.getContent();
				curr = curr.next();
				return element;
			}
			public T previous()  {
				T element = curr.getContent();
				if(curr!=null) {
					curr = curr.previous();
					return element;
				}
				throw new NoSuchElementException();
			}
			@Override
			public boolean hasPrevious() {
				if(curr==null&&!flag) {
					curr=tail;
					flag = true;
				}
				if(curr != null) {
					return true;
				}
				return false;
			}
			@Override
			public void add(Object e) {
				throw new UnsupportedOperationException();				
			}
			@Override
			public int nextIndex() {
				throw new UnsupportedOperationException();				
			}
			@Override
			public int previousIndex() {
				throw new UnsupportedOperationException();				
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();				

			}

			@Override
			public void set(Object e) {
				throw new UnsupportedOperationException();				

			}
		};

	}
	public static void main (String[]args) {
		DoublyLinkedList<String> a = new DoublyLinkedList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");	
		a.add("e");	    	
		ListIterator<String> iter = a.listIterator();
		while (iter.hasNext()) {
			System.out.print(" "+iter.next());

		}
		System.out.println();
		ListIterator<String> iter3= a.listIterator();
		while (iter3.hasPrevious()) {
			System.out.print(iter3.previous()+" ");

		}
	}
}

