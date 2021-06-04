package ads.project236.dataStructures.graphs;

import ads.project236.dataStructures.SingleLinkedListInt;

public class UndirectedGraphListRepresentation extends DirectedGraphListRepresentation
{
	
	public UndirectedGraphListRepresentation(int quantityOfNodes) 
	{
		super(quantityOfNodes);
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
				list.add(count++, i);
				list.add(count++, j);
			}
		}
	}

}
