import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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
	            list.add(w);
	            Edge++;
	    }


	public boolean hasCycle() {

        return hasCycle;
    }

	 public void findCycle(int v) {

	        marked[v] = true;
	        stack[v] = true;

	        for (int w : adj(v)) {
	            if(!marked[w]) {
	                findCycle(w);
	            } else if (stack[w]) {
	                hasCycle = true;
	                return;
	            }
	        }

	        stack[v] = false;
	    }


	 public ArrayList<Integer> findLCA(int vertice1, int vertice2) {

	        ArrayList<Integer> LCA = new ArrayList<>();
	        Queue<Integer> level = new LinkedList<>();
	        Queue<Integer> followingLevel = new LinkedList<>();
	        if (vertice1 == vertice2) {
	        	LCA.add(vertice1);
	            return LCA;
	        }
	        boolean[] vertices1Ancestors = new boolean[adj.length];
	        ArrayList<Integer>[] table = reverse(adj);
	        Arrays.fill(vertices1Ancestors, false);

	        vertices1Ancestors[vertice1] = true;
	        for(int v : table[vertice1]) {
	            markAncestors(table, vertices1Ancestors, v);
	        }
	        for(int v : table[vertice2]) {
	            level.add(v);
	        }

	        while(!level.isEmpty()) {
	                int vertices = level.remove();
	                if(vertices1Ancestors[vertices]) {
	                	LCA.add(vertices);
	                }
	                if(LCA.isEmpty()) {
	                    for (int w : table[vertices]) {
	                    	followingLevel.add(w);
	                    }
	                }

	            level = followingLevel;
	            followingLevel = new LinkedList<>();
	        }
	        return LCA;
	    }

	    public void markAncestors(ArrayList<Integer>[] parentTable, boolean[] vertice1Ancestors, int vertices) {
	        vertice1Ancestors[vertices] = true;
	        for(int vertice : parentTable[vertices]) {
	            markAncestors(parentTable, vertice1Ancestors, vertice);
	        }
	    }
	    public ArrayList<Integer>[] reverse(ArrayList<Integer>[] adj) {
	        ArrayList<Integer>[] reverse = (ArrayList<Integer>[]) new ArrayList[adj.length];
	        for(int i = 0; i < reverse.length; i++) {
	            reverse[i] = new ArrayList<>();
	        }
	        for(int vertice = 0; vertice < adj.length; vertice++) {
	            for(int w : adj[vertice]) {
	                addEdge(reverse, w, vertice);
	            }
	        }
	        return reverse;
	    }
}
