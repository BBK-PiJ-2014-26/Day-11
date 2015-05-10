/**
 * Answers Q5 from Day-11.
 */
public class GenericStack<E extends Number> {

	private Node node;
	
	class Node {
		protected E element;
		protected Node next;
	
		public Node(E element) {
			this.element = element;
			this.next = null;
		}
		
		public void add(E element) {
			if (next.equals(null)) {
				next = new Node(element);
			} else {
				next.add(element);
			}
		}
		
		public E remove() {
			E result = null;
			if (next.next.equals(null)) {
				result = element;
				next = null;
			} else {
				result = next.remove();
			}
			return result;
		}
	}
	
	public GenericStack() {
		this.node = null;
	}
	
	public void push(E element) {
		if (!isEmpty()) {
			node.add(element);
		} else {
			node = new Node(element);
		}
	}
	
	public E pop() {
		E result = null;
		if (!isEmpty()) {
			result = node.remove();
		}
		return result;
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if (node.equals(null)) {
			result = true;
		}
		return result;
	}
}
