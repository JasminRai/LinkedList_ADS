package ads.project236.dataStructures.graphs;
import java.util.Iterator;

public class DirectedGraphMatrixRepresentation extends Graph 
{
	protected boolean[][] matrix;

	public DirectedGraphMatrixRepresentation(int quantityOfNodes) 
	{
		super(quantityOfNodes);
		// Darstellung der Matrix als ArrayList von ArrayLists

		matrix = new boolean[quantityOfNodes][quantityOfNodes];

		for (int i=0; i<quantityOfNodes; i++) 
		{
			for (int j=0; j<quantityOfNodes; j++) 
			{
				matrix[i][j] = false;
//				matrix[j][i] = false;		<-- this is overwriting the values, useless code. :(
			}
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
		return matrix[i][j];
	}

	@Override
	public void setEdge(int i, int j)
	{
		matrix[i][j] = true;
	}
}

