/*
CODE NOT USED DUE TO INABILITY OF TESTING code



  #include "stdio.h"
  #include "stdlib.h"
  #include "string.h"
  #include "math.h"


   struct node { // creating the template for the BST
     int data; // value in node
     struct node *left, *right; // pointer to the next node
   };

    struct node * newNode(int data){ // function to create a new node in the BST
      struct node * node = (struct node*)malloc(sizeof(struct node));  //creating the nodes memory
      node->data = data; //setting data
      node->left = node->right = NULL;
      return(node);
    }

    struct node *lca(struct node* root, int n1, int n2)
  {
      if (root == NULL){
        return NULL;
      }

      if (root->data > n1 && root->data > n2){
          return lca(root->left, n1, n2);
  }
      if (root->data < n1 && root->data < n2){
          return lca(root->right, n1, n2);
  }
      return root;
  }

  int main(int argc, char const *argv[]) {
    struct node *root        = newNode(20);
      root->left               = newNode(8);
      root->right              = newNode(22);
      root->left->left         = newNode(4);
      root->left->right        = newNode(12);
      root->left->right->left  = newNode(10);
      root->left->right->right = newNode(14);

      int n1 = 10, n2 = 14;
      struct node *t = lca(root, n1, n2);
      printf("LCA of %d and %d is %d \n", n1, n2, t->data);

      n1 = 14, n2 = 8;
      t = lca(root, n1, n2);
      printf("LCA of %d and %d is %d \n", n1, n2, t->data);

      n1 = 10, n2 = 22;
      t = lca(root, n1, n2);
      printf("LCA of %d and %d is %d \n", n1, n2, t->data);

      getchar();
  
    return 0;
  }
  */
