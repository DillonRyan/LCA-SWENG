import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCATest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void TestWithOne() {
		LCA.BT_NoParentPtr_Solution1 BST = new LCA.BT_NoParentPtr_Solution1();
		BST.root = new LCA.Node(22);
//What the tree looks like
//				22

        assertEquals( 22,BST.findLCA(22,22));

	}

	@Test
	public void TestWithTwo() {
		LCA.BT_NoParentPtr_Solution1 BST = new LCA.BT_NoParentPtr_Solution1();
		BST.root = new LCA.Node(22);
		BST.root.left = new LCA.Node(11);
        BST.root.right = new LCA.Node(15);
//What the tree looks like
//   	 22
//		/   \
//	   11   15

        assertEquals( 22,BST.findLCA(11,15));
        assertEquals( 22,BST.findLCA(11,22));
        assertEquals( 22,BST.findLCA(15,22));

	}

	 @Test
	    public void TestWithThree() {
	        LCA.BT_NoParentPtr_Solution1 BST = new LCA.BT_NoParentPtr_Solution1();
	        BST.root = new LCA.Node(22);
	        BST.root.left = new LCA.Node(11);
	        BST.root.right = new LCA.Node(15);
	        BST.root.left.left = new LCA.Node(9);
	        BST.root.left.right = new LCA.Node(2);
	        BST.root.right.left = new LCA.Node(34);
	        BST.root.right.right = new LCA.Node(5);

//		What the tree looks like
//	        	 22
//				/   \
//			   11   15
//			  / \   / \
//			 9   2 34  5


	        assertEquals( 22,BST.findLCA(9, 34));
	        assertEquals( 11,BST.findLCA(2, 11));
	        assertEquals( 22,BST.findLCA(11, 15));
	        assertEquals( 15,BST.findLCA(34, 5));
	        assertEquals( 22,BST.findLCA(11, 5));

	    }
			

	 @Test
	    public void TestWithNegative() {
	        LCA.BT_NoParentPtr_Solution1 BST = new LCA.BT_NoParentPtr_Solution1();
	        BST.root = new LCA.Node(-22);
	        BST.root.left = new LCA.Node(-11);
	        BST.root.right = new LCA.Node(-15);
	        BST.root.left.left = new LCA.Node(-9);
	        BST.root.left.right = new LCA.Node(-2);
	        BST.root.right.left = new LCA.Node(-34);
	        BST.root.right.right = new LCA.Node(-5);

//		What the tree looks like
//	        	 -22
//				/   \
//			  -11   -15
//			  / \   / \
//		   -9  -2 -34  -5


	        assertEquals( -22,BST.findLCA(-9, -34));
	        assertEquals( -11,BST.findLCA(-2, -11));
	        assertEquals( -22,BST.findLCA(-11, -15));
	        assertEquals( -15,BST.findLCA(-34, -5));
	        assertEquals( -22,BST.findLCA(-11, -5));
	    }

	 @Test
	 	public void TestNotInTree() {
	        LCA.BT_NoParentPtr_Solution1 BST = new LCA.BT_NoParentPtr_Solution1();
	        BST.root = new LCA.Node(22);
	        BST.root.left = new LCA.Node(11);
	        BST.root.right = new LCA.Node(15);
	        BST.root.left.left = new LCA.Node(9);
	        BST.root.left.right = new LCA.Node(2);
	        BST.root.right.left = new LCA.Node(34);
	        BST.root.right.right = new LCA.Node(5);


//			What the tree looks like
//		        	 22
//					/   \
//				   11   15
//				  / \   / \
//				 9   2 34  5

	        assertEquals(-1,BST.findLCA(83, 343)); // arent in the tree
	        assertEquals(-1,BST.findLCA(1, 43));  // arent in the tree
	        assertEquals(-1,BST.findLCA(7, 211)); // arent in the tree
	        assertEquals(-1,BST.findLCA(11, 432)); // only one is in the tree
	        assertEquals(-1,BST.findLCA(34, 8)); // only one is in the tree
	        assertEquals(-1,BST.findLCA(22, 19)); // only one is in the tree


	 }
}
