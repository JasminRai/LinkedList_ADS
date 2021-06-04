package programs;

import ads.project236.dataStructures.graphs.DirectedGraphListRepresentation;
import ads.project236.dataStructures.graphs.DirectedGraphMatrixRepresentation;
import ads.project236.dataStructures.graphs.UndirectedGraphListRepresentation;
import ads.project236.dataStructures.graphs.UndirectedGraphMatrixRepresentation;

public class Program09 {

	public static void main(String[] args) {
		
		DirectedGraphListRepresentation dgl = new DirectedGraphListRepresentation(3);
		dgl.setEdge(0, 2);
		dgl.setEdge(2, 1);
		System.out.println("----- Directed Graph (Adjacency List) ------");
		//	Checking true edges 
		System.out.println("Edge [" + 0 + " , " + 2 + "] :"+ dgl.isEdge(0, 2));
		System.out.println("Edge [" + 2 + " , " + 1 + "] :"+ dgl.isEdge(2, 1));

		//	Checking false edges 
		System.out.println("Edge [" + 3 + " , " + 1 + "] :"+ dgl.isEdge(3, 1));
		System.out.println("Edge [" + 1 + " , " + 1 + "] :"+ dgl.isEdge(1, 1));
		
		
		
		UndirectedGraphListRepresentation udgl = new UndirectedGraphListRepresentation(3);
		udgl.setEdge(0, 2);
		udgl.setEdge(2, 1);
		System.out.println("----- Undirected Graph (Adjacency List)------");
		
		//	Checking true edges 
		System.out.println("Edge [" + 0 + " , " + 2 + "] :"+ udgl.isEdge(0, 2));
		System.out.println("Edge [" + 2 + " , " + 1 + "] :"+ udgl.isEdge(2, 1));

		//	Checking false edges 
		System.out.println("Edge [" + 3 + " , " + 1 + "] :"+ udgl.isEdge(3, 1));
		System.out.println("Edge [" + 1 + " , " + 1 + "] :"+ udgl.isEdge(1, 1));
		
		
		DirectedGraphMatrixRepresentation dgm = new DirectedGraphMatrixRepresentation(3);
		dgm.setEdge(0, 2);
		dgm.setEdge(2, 1);
		
		System.out.println("----- Directed Graph (Adjacency Matrix)------");
		
		//	Checking true edges 
		System.out.println("Edge [" + 0 + " , " + 2 + "] :"+ dgm.isEdge(0, 2));
		System.out.println("Edge [" + 2 + " , " + 1 + "] :"+ dgm.isEdge(2, 1));

		//	Checking false edges 
		System.out.println("Edge [" + 3 + " , " + 1 + "] :"+ dgm.isEdge(0, 1));
		System.out.println("Edge [" + 1 + " , " + 2 + "] :"+ dgm.isEdge(1, 2));
		
		UndirectedGraphMatrixRepresentation udgm = new UndirectedGraphMatrixRepresentation(3);
		udgm.setEdge(0, 2);
		udgm.setEdge(2, 1);
		
		System.out.println("----- Undirected Graph (Adjacency Matrix)------");
		
		//	Checking true edges 
		System.out.println("Edge [" + 0 + " , " + 2 + "] :"+ udgm.isEdge(0, 2));
		System.out.println("Edge [" + 2 + " , " + 1 + "] :"+ udgm.isEdge(2, 1));

		//	Checking false edges 
		System.out.println("Edge [" + 3 + " , " + 1 + "] :"+ udgm.isEdge(0, 1));
		System.out.println("Edge [" + 1 + " , " + 2 + "] :"+ udgm.isEdge(1, 2));
	}

}
