package ads.project236.dataStructures.graphs;

import ads.project236.dataStructures.SingleLinkedList;
import ads.project236.dataStructures.SingleLinkedListInt;
import java.util.Iterator;

public class DirectedGraphListRepresentation extends Graph {

	protected SingleLinkedList<SingleLinkedListInt> adjacencyList;
	
	public DirectedGraphListRepresentation(int quantityOfNodes) 
	{
		super(quantityOfNodes);
		// Darstellung der Matrix als ArrayList von ArrayLists
		adjacencyList = new SingleLinkedList<SingleLinkedListInt>();
	
		for (int i = 0; i < quantityOfNodes; i++) 
		{
			adjacencyList.add(0, new SingleLinkedListInt());
		}
	}
	
	
	@Override
	public Iterator<Integer> getNeighbourIterator(int i) 
	{
		return new NeighbourIterator(this, i);
	}
	
	@Override
	public boolean isEdge(int i, int j) 
	{
		for (int k = 0; k < quantityOfNodes; k++) 
		{
			if( k == i)
			{
				SingleLinkedListInt list = adjacencyList.get(k);
				if (list.contains(j))
				{
					return true;
				}
			}
		}
		return false;		
	}
	
	@Override
	public void setEdge(int i, int j) 
	{
		int count = 0;
		
		for (int k = 0; k < quantityOfNodes; k++) 
		{
			if( k == i)
			{
				SingleLinkedListInt list = adjacencyList.get(k);
				list.add(count++, j);
			}
		}
				
	}
}
