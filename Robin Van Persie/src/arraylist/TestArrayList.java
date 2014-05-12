package arraylist;

public class TestArrayList {

	public static void main(String[] args) {
		
		System.out.println("Test ArrayList");
		ArrayList list = new ArrayList();
		list.add("Number 1");
		list.add("Number 2");
		list.add("Number 3");
		list.add("Number 4");
		list.add("Number 5");
		System.out.println(list);
		

		
		System.out.println("Test ArrayListQueue");
		ArrayListQueue queue = new ArrayListQueue();
		queue.enQueue("Number 1");
		queue.enQueue("Number 2");
		queue.enQueue("Number 3");
		queue.enQueue("Number 4");
		queue.enQueue("Number 5");
		System.out.println(queue);
		
		
		
		System.out.println("Test ArrayListStack");
		ArrayListStack stack = new ArrayListStack();
		stack.push("Number 1");
		stack.push("Number 2");
		stack.push("Number 3");
		stack.push("Number 4");
		stack.push("Number 5");
		System.out.println(stack);
	}

}