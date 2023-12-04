import java.util.ArrayList;
import java.util.List;

public class LearnArray_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList=new ArrayList<>();
		myList.add(20);
		myList.add(40);
		myList.add(null);
		myList.add(502);
		myList.add(480);
		myList.add(90);
		myList.add(80);
		
		myList.set(5, 786);
		myList.add(1,30);
		/*if(myList[i]>3) {
			System.out.print("Ok");
		}else {
			System.out.print("Not Ok");
		}
		*/
		System.out.println(myList);
		System.out.println(myList.get(2));
		System.out.println(myList.remove(4)); //480
		System.out.println(myList.contains(480));
		System.out.println(myList);
		System.out.println(myList.contains(15));
		System.out.println("The Size of myArray is: "+myList.size());
		
		

	}

}
