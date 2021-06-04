package ads.project236.dataStructures.graphs;

public class UndirectedGraphMatrixRepresentation extends DirectedGraphMatrixRepresentation{

	public UndirectedGraphMatrixRepresentation(int quantityOfNodes) {
		super(quantityOfNodes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setEdge(int i, int j)
	{
		matrix[i][j] = true;
		matrix[j][i] = true;	
	}
}
