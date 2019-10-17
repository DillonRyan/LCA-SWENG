import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
 public class DAGTest {

	 @Test
	    public void testForAddingEdges() {

	        DAG graph = new DAG(10);
	        graph.addEdge(4,3);
	        graph.addEdge(3,7);
	        graph.addEdge(7, 5);
	        graph.addEdge(5, 6);
	        graph.addEdge(6, 8);

	        assertEquals(5, graph.Edge()); // number of edges is 5
	        assertEquals(10, graph.Vertices()); //number of vertices is 10
	    }
		@Test
			public void testForDirectedGraph(){
				DAG graph = new DAG(10);
				graph.addEdge(1, 2);
				graph.addEdge(1, 3);
				graph.addEdge(3, 4);
				graph.addEdge(4, 5);
				graph.addEdge(4, 6);

				assertEquals(0, graph.indegree(4));
				assertEquals(2, graph.outdegree(4));
				String ans = "[5, 6]";
				assertEquals(ans, graph.adj(4).toString());
			}

			@Test
			public void testinDegree(){
				DAG graph = new DAG(5);
				assertEquals("", -1, graph.indegree(-3));
			}

			@Test
			public void testOutDegree(){
				DAG graph = new DAG(5);
				assertEquals(-1, graph.outdegree(8));
			}
		}
	
