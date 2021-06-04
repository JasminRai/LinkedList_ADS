package ads.project236.dataStructures.graphs;

import java.util.Iterator;

public class NeighbourIterator implements Iterator<Integer> 
{
	private Graph graph;
	private int sourceNode, pointer;

	public NeighbourIterator(Graph graph, int node) 
	{
		this.graph = graph;
		sourceNode = node;
		pointer = 0;
		tryNext();
	}

	@Override
	public boolean hasNext() 
	{
		return pointer < graph.getSize();
	}

	@Override
	public Integer next() 
	{
		int k = pointer;
		pointer++;
		tryNext();
		return k;
	}

	private void tryNext() 
	{
		while (pointer < graph.getSize())
			if (graph.isEdge(sourceNode, pointer))
				return;
			else
				pointer++;
	}

	@Override
	public void remove() 
	{
		// not implemented
	}
}
