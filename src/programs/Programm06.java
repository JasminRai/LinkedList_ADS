package programs;

import ads.project236.dataStructures.SingleLinkedList;

public class Programm06 {

	public static void main(String[] args) {
	

		SingleLinkedList<Integer> sl = new SingleLinkedList<Integer>() ;
		
		sl.add(0, 165);
		sl.add(1, 123);
		sl.add(2, 111);
		sl.add(3, 151);
		sl.add(2, 147);
		
		for(int i =0;  i < 5; i++ )
		{
			System.out.println("Node "+i+" :"+sl.get(i));
		}
	}

}
