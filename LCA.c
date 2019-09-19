#include "stdio.h"
#include "stdlib.h"
#include "string.h"
#include "math.h"


 struct BNode {
   int data;
   struct BNode *left, *right;
 };

  struct BNode * newNode(int data){
    struct BNode * node = (struct BNode*)malloc(sizeOf(struct BNode));
    node->data = data;
    node->left = node->right = NULL;
    return(node);
  }

int main(int argc, char const *argv[]) {
  /* code */
  return 0;
}
