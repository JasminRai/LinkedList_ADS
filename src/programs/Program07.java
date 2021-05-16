package programs;

import ads.project236.dataStructures.SingleLinkedListInt;
import ads.project236.dataStructures.Stack;

public class Program07 {

	public static void main(String[] args) {
		
		SingleLinkedListInt sl = new SingleLinkedListInt() ;
		sl.add(0, 165);
		sl.add(1, 123);
		sl.add(2, 111);
		sl.add(3, 151);
		sl.add(0, 787);
		
		for(int i =0;  i < 5; i++ )
		{
			System.out.print(sl.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("Deleted element: " + sl.remove(2));
		System.out.println("Does the element exist? : " + sl.contains(123));
		for(int i =0;  i < 4; i++ )
		{
			System.out.print(sl.get(i)+" ");
		}
		
		
		// --------------------------------------------------------------
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(20); 
		st.push(60); 
		st.push(80); 
		st.push(40); 

		System.out.println( st.pop());
		System.out.println( st.pop());
		
		st.push(90); 
		System.out.println( st.pop());
		
	}

}
