package ads.project236.dataStructures.graphs;

import java.util.Iterator;

public abstract class Graph {
	
	public int quantityOfNodes;
	
	public abstract boolean isEdge(int i, int j);
	public abstract void setEdge(int i, int j);
	
	public Graph(int quantityOfNodes) 
	{
		this.quantityOfNodes = quantityOfNodes;
	}
	
	public int getSize() 
	{
		return quantityOfNodes;
	}
	
	public Iterator<Integer> getNeighbourIterator(int node) 
	{
		return new NeighbourIterator(this, node);
	}
	
	
	
}
