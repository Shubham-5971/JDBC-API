import java.util.ArrayList;

public class LearnArrayList_2 {

	// private static final char[] name = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		name.add("Ram");
		name.add("Sham");
		name.add("Pavan");
		name.add("Nilesh");
		name.add("Rohit");
		name.add("Shubham");
		name.add("Vishwa");
		name.add("Rakesh");
		
		System.out.println(name);
		System.out.println(" ");
		for(int i=0;i<name.size();i++) {
			if(i==3) {
				break;
			}
			System.out.println("Name of Each index is: "+name.get(i));
		}

	}

}
