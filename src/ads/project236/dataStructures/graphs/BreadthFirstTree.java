package ads.project236.dataStructures.graphs;

import java.util.ArrayList;
import java.util.Iterator;

import ads.project236.dataStructures.Queue;

public class BreadthFirstTree 
{
	private Graph graph; // ungerichteter Graph (ohne Kantengewichtung)
	private int n; // Anzahl der Knoten
	private double[] dist; // Abstand zum Startknoten
	private int[] pred; // Vorg¨anger im Baum
	private boolean[] tree; // Zugeh¨origkeit zum Baum

	public BreadthFirstTree(Graph graph_, int s) {
		graph = graph_;
		n = graph.getSize();
		dist = new double[n];
		pred = new int[n];
		tree = new boolean[n];
     // Arrays initialisieren
		for (int i = 0; i < n; i++) {
			dist[i] = n;
			pred[i] = -1;
			tree[i] = false;
		}
		computeBreadthFirstTree(s);
	}

// fuhrt den Algorithmus Breitensuche aus
private void computeBreadthFirstTree(int s)
{
	int u, v;
	Iterator<Integer> it;
	Queue<Integer> queue = new Queue<Integer>();
	dist[s]=0;
	tree[s]=true;
	queue.add(s);
	while (!queue.isEmpty())
	{
		u=queue.remove();
		it=graph.getNeighbourIterator(u);
		while (it.hasNext())
		{
			v=it.next();
			if (!tree[v])
			{
				dist[v]=dist[u]+1;
				pred[v]=u;
				tree[v]=true;
				queue.add(v);
			}
		}
	}
}

	public double getDistance(int v) {
		return dist[v];
	}

	public int getPredecessor(int v) {
		return pred[v];
	}

// liefert die Folge der Knoten vom Knoten v
// zum Startknoten im Baum der k¨urzesten Wege
	public ArrayList<Integer> getShortestPath(int v) {
		ArrayList<Integer> p = new ArrayList<Integer>();
		while (v != -1) {
			p.add(0, v);
			v = getPredecessor(v);
		}
		return p;
	}

// liefert den Breitensuchbaum als gerichteten Graphen
	public Graph getBreadthFirstTree() {
		Graph bft = new DirectedGraphListRepresentation(n);
		for (int v = 0; v < n; v++)
			if (pred[v] >= 0)
				bft.setEdge(pred[v], v);
		return bft;
	}
} // end class BreadthFirstTreef