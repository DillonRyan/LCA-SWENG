import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;


public class DAG {
  private int Vertices;
	private int Edge;
  private ArrayList<Integer>[] adj;
  private int[] indegree;
  private boolean marked[];
  private boolean hasCycle;

}

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
