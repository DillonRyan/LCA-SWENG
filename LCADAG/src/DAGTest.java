import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
 public class DAGTest {

	 @Test
	    public void testForAddingEdges() {

	        DAG graph = new DAG(10);
	        graph.addEdge(4,3);//Connecting directed edge going from vertex 4 to vertex 3
	        graph.addEdge(3,7);//Connecting directed edge going from vertex 3 to vertex 7
	        graph.addEdge(7, 5);//Connecting directed edge going from vertex 7 to vertex 5
	        graph.addEdge(5, 6);//Connecting directed edge going from vertex 5 to vertex 6
	        graph.addEdge(6, 8);//Connecting directed edge going from vertex 6 to vertex 8

	        assertEquals(5, graph.Edge()); // number of edges is 5
	        assertEquals(10, graph.Vertices()); //number of vertices is 10
	    }
		@Test
			public void testForDirectedGraph(){
				DAG graph = new DAG(10);
				graph.addEdge(1, 2);//Connecting directed edge going from vertex 1 to vertex 2
				graph.addEdge(1, 3);//Connecting directed edge going from vertex 1 to vertex 3
				graph.addEdge(3, 4);//Connecting directed edge going from vertex 3 to vertex 4
				graph.addEdge(4, 5);//Connecting directed edge going from vertex 4 to vertex 5
				graph.addEdge(4, 6);//Connecting directed edge going from vertex 4 to vertex 6

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
			@Test
			public void testsForCycleInCyclic(){
				DAG graph = new DAG(20);
				graph.addEdge(0, 1);//Connecting directed edge going from vertex 0 to vertex 1
				graph.addEdge(1, 2);//Connecting directed edge going from vertex 1 to vertex 2
				graph.addEdge(2, 0);//Connecting directed edge going from vertex 2 to vertex 0
				graph.findCycle(0);
				assertTrue(graph.hasCycle());//Cycle from 0 - 1 - 2 - 0, which should return true.
			}
			@Test
			public void testsForCycleInAyclic(){
				DAG graph = new DAG(20);
				graph.addEdge(0, 1); //Connecting directed edge going from vertex 0 to vertex 1
				graph.addEdge(1, 3); //Connecting directed edge going from vertex 1 to vertex 3
				graph.addEdge(2, 4); //Connecting directed edge going from vertex 2 to vertex 4
				graph.findCycle(0);
				assertFalse(graph.hasCycle()); //No Cycle,return false
			}

			 @Test
			    public void testLowestCommonAncestor() {
/*									  10
 * 								   /  \
 * 								  /    \
 * 								 /      \
 * 								/        \
 *               ↙          ↘
 * 							5            15
 *							|             |
 * 							ꜜ			        ꜜ
 * 							3				     20
 * 						 / \			     / \
 * 					  /   \		      ↙   ↘
 * 					 /     \       13    14
 * 				  ↙		    ↘
 * 				1		       2
 * 								  /
 * 								 /
 * 								↙
 * 							4
 * 						 / \
 * 					 /   \
 * 				 ↙     ↘
 * 			 6       7
 *
 */


			        DAG graph = new DAG(22);

			        //starting at head with head = 10
			        graph.addEdge(10, 5); //Connecting directed edge going from vertex 10 to vertex 5
			        graph.addEdge(10, 15); //Connecting directed edge going from vertex 10 to vertex 15
			        //going down the right branch
			        graph.addEdge(15, 20); //Connecting directed edge going from vertex 15 to vertex 20
			        graph.addEdge(20, 13); //Connecting directed edge going from vertex 20 to vertex 30
			        graph.addEdge(20, 14); //Connecting directed edge going from vertex 20 to vertex 40
			        //going down the left branch
			        graph.addEdge(5, 3); //Connecting directed edge going from vertex 5 to vertex 3
			        //going down the left left branch
			        graph.addEdge(3, 1); //Connecting directed edge going from vertex 3 to vertex 1
			        //going down the left right branch
			        graph.addEdge(3, 2); //Connecting directed edge going from vertex 3 to vertex 2
			        //going down the left right left branch
			        graph.addEdge(2, 4); //Connecting directed edge going from vertex 2 to vertex 4
			        graph.addEdge(4, 6); //Connecting directed edge going from vertex 4 to vertex 6
			        graph.addEdge(4, 7); //Connecting directed edge going from vertex 4 to vertex 7

			        //find LCA
			        ArrayList<Integer> lca = graph.findLCA(1, 2);
			        String result = "[3]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(1, 6);
			        result = "[3]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(30, 30);
			        result = "[30]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(6,7);
			        result = "[4]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(1, 4);
			        result = "[3]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(7,5);
			        result = "[10]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(5,15);
			        result = "[10]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(13,14);
			        result = "[20]";
			        assertEquals(result, lca.toString());

			        lca = graph.findLCA(6,14);
			        result = "[10]";
			        assertEquals(result, lca.toString());

			    }


 }
