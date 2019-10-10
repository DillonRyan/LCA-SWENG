# LCA-SWENG
Repo for Software engineering Lowest common ancestor problem
For this project i started off writing my program in C and using atom as my IDE, i ran into trouble though when i started trying to write tests for my code. It proved troublesome and there was very little resources in finding ways of doing it. This led me to changing my language to Java and using Eclipse as my IDE

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
