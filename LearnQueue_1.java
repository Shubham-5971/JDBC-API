import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> clg=new LinkedList<>();
		clg.offer("Dy Patil");
		clg.offer("RMC");
		clg.offer("Indira");
		clg.offer("Pratibha");
		
		System.out.println(clg);
		System.out.println(clg.poll());
		System.out.println(clg);
	}

}
