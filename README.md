# LCA-SWENG
Repo for Software engineering Lowest common ancestor problem and Directed Acyclic Graph
For this project I started off writing my program in C and using atom as my IDE, I ran into trouble though when I started trying to write tests for my code. It proved troublesome and there was very little resources in finding ways of doing it. This led me to changing my language to Java and using Eclipse as my IDE. I ran out of time at the end of this assignment to try and write the tests for the code in C but  I have completed both the LCA and DAG problems.
The code coverage for both the DAG and LCA are both 100%

In a BST like the one shown below the LCA can be calculated by find the lowest node that is common to both nodes

           22
          /  \
         /	  \
       17	     4
       / \	  / \
      /   \  /   \
     3	  8 4    26

And here are some examples of the LCA of the above tree
     LCA (3,8) = 17
     LCA (8,26) = 22
     LCA (8,8) = 8
     LCA (17,4) = 22
