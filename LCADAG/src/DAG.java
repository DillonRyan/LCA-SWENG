import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DAG {
	private int Vertices;
	private int Edge;
	private ArrayList<Integer>[] adj;
	private int[] indegree;
	private boolean marked[];
	private boolean hasCycle;
    private boolean stack[];

	public DAG(int V)
	{
	    this.Vertices = V;
	    this.Edge = 0;
	    indegree = new int[V];
	    adj = (ArrayList<Integer>[]) new ArrayList[V];
	    for (int v = 0; v < V; v++) {
	        adj[v] = new ArrayList<Integer>();
	    }
	    marked = new boolean[V];
	    stack = new boolean[V];
	}

	   /**
     * Returns the number of vertices in this digraph.
     *
     * @return the number of vertices in this digraph
     */
    public int Vertices() {
        return Vertices;
    }

    /**
     * Returns the number of edges in this digraph.
     *
     * @return the number of edges in this digraph
     */
    public int Edge() {
        return Edge;
    }


	private int validateVertex(int v) {
        if (v < 0 || v >= Vertices)
        	return -1;
        else
        	return 1;
        }
	//Returns amount of directed edges incident to vertex v
	public int indegree(int v) {
		if(validateVertex(v)<0){
			return -1;
		}
		else{
			return indegree[v];
		}
	}

	public int outdegree(int v) { // amount of directed edges from vertex v
		if(validateVertex(v)<0){
			return -1;
		}
		else{
			return adj[v].size();
		}
    }

		public Iterable<Integer> adj(int v){ //vertices adjacent to v
		return adj[v];
		}

		public void addEdge(int v, int w) { 		//Adds a directed edge going from v to w

	        if (v >= 0 && v < adj.length && w >= 0 && w < adj.length) {
	            addEdge(adj, v, w);
	        }
	    }

	    public void addEdge(ArrayList<Integer>[] adj, int v, int w) {
	        ArrayList<Integer> list = adj[v];
	        if(!list.contains(w)); {
	            list.add(w);
	            Edge++;
	        }

	    }
}
	  
