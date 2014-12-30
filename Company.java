public class Company {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> nI = new DoublyLinkedList<Integer>(100001425);
		DoublyLinkedList<Integer> nI2 = new DoublyLinkedList<Integer>(100001478);
		DoublyLinkedList<Integer> nI3 = new DoublyLinkedList<Integer>(1004561425);
		nI.addFirst(nI2);
		nI.addNode(nI3);
		nI.printListForwards();
		DoublyLinkedList<String> emp = new DoublyLinkedList<String>("bob");
		DoublyLinkedList<String> emp2 = new DoublyLinkedList<String>("nige");
		DoublyLinkedList<String> emp3 = new DoublyLinkedList<String>("mary");
		emp.addFirst(emp2);
		emp2.addNode(emp3);
		emp3.printListBackwards();
	}
}