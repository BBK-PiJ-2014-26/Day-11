public class DoublyLinkedList<T> {
	private T name;
	private DoublyLinkedList next;
	private DoublyLinkedList previous;

	public DoublyLinkedList(T name) {
		this.name = name;
		this.next = null;
		this.previous = null;
	}

	public void addFirst(DoublyLinkedList first) {
		this.next = first;
		first.previous = this;
	}

	public void addNode(DoublyLinkedList node) {
		if (this.next == null) {
			this.next = node;
			node.previous = this;
		} else {
			this.next.addNode(node);
		}
	}

		public T getName() {
			return name;
		}

		public void printListForwards() {
			if (next != null) {
				System.out.println(this.getName());
				next.printListForwards();
			} else {
				System.out.println(this.getName());
			}
		}

		public void printListBackwards() {
			if (previous != null) {
				System.out.println(this.getName());
				previous.printListBackwards();
			} else {
				System.out.println(this.getName());
			}
		}

		public boolean deleteNode(String name) {
			if (this.next == null) {
				return false;
			} else if (this.next.name.equals(name)) {
				this.next = next.next;
				next.previous = this;
				return true;
			} else {
				return this.next.deleteNode(name);
			}
	}
}