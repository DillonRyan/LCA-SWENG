#include "stdio.h"
#include "stdlib.h"
#include "string.h"
#include "math.h"


 struct BNode { // creating the template for the BST
   int data; // value in node
   struct BNode *left, *right; // pointer to the next node
 };

  struct BNode * newNode(int data){ // function to create a new node in the BST
    struct BNode * node = (struct BNode*)malloc(sizeof(struct BNode));  //creating the nodes memory 
    node->data = data; //setting data
    node->left = node->right = NULL;
    return(node);
  }

int main(int argc, char const *argv[]) {
  /* code */
  return 0;
}
