package programs;

import ads.project236.dataStructures.Queue;

public class Program08 {

	public static void main(String[] args) {

		Queue<Integer> st = new Queue<Integer>();
		st.add(20); 
		st.add(60); 
		st.add(80); 
		st.add(40); 

		System.out.println( st.remove());
		System.out.println( st.remove());
		
		st.add(90); 
		System.out.println( st.remove());
		
	}
}
