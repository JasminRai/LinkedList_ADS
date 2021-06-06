package programs;

import ads.project236.dataStructures.graphs.BreadthFirstTree;
import ads.project236.dataStructures.graphs.Graph;
import ads.project236.dataStructures.graphs.UndirectedGraphListRepresentation;
import ads.project236.dataStructures.graphs.UndirectedGraphMatrixRepresentation;

public class Program10 {
	public static void main(String[] args) {
		int size = 12;
		Graph undGraphList = new UndirectedGraphListRepresentation(size);
		Graph undGraphMatrix = new UndirectedGraphMatrixRepresentation(size);
		makeEdges(undGraphList);
		makeEdges(undGraphMatrix);
		BreadthFirstTree bftList = new BreadthFirstTree(undGraphList, 5);
		BreadthFirstTree bftMatrix = new BreadthFirstTree(undGraphMatrix, 5);
		Graph g1 = bftList.getBreadthFirstTree();
		Graph g2 = bftMatrix.getBreadthFirstTree();
	}

public static void makeEdges(Graph g) {
g.setEdge(5, 1);
g.setEdge(5, 7);
g.setEdge(1, 11);
g.setEdge(1, 8);
g.setEdge(1, 3);
g.setEdge(7, 11);
g.setEdge(7, 8);
g.setEdge(7, 3);
g.setEdge(11, 4);
g.setEdge(11, 2);
g.setEdge(8, 4);
g.setEdge(8, 2);
g.setEdge(3, 4);
g.setEdge(3, 2);
g.setEdge(4, 0);
g.setEdge(2, 0);
g.setEdge(6, 9);
g.setEdge(9, 10);
}
}
