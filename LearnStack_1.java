// import java.util.LinkedList;
import java.util.Stack;

public class LearnStack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals=new Stack<>();
		
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Horse");
		animals.push("Lion");// First Element 
		
		System.out.println(animals);
		// animals.pop(); // Remove First Element
		System.out.println(animals.peek());
		System.out.println(animals);

	}

}
