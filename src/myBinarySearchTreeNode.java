class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){ //constructor deals with the left and right nodes.
    // created a new node with empty child pointers
    myValue = inValue;
  }
  
  myBinarySearchTreeNode(int[] A){ //constructor deals with creating root and assembling tree by calling insert method.
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    myValue = A[0];
    for(int i = 1; i < A.length; i++){ //for loop is sent to insert to actually create tree.
      insert(A[i]);
    }
//    tree.insert(A[1]);
//    tree.insert(A[2]);
//    tree.insert(A[3]);
  }
  
  public void insert(int inValue){
    if(inValue == myValue){ //if any value repeats that value should not be added again
      System.out.print("Can't repeat numbers"); //if it does repeat then it displays this method.

    }else{
   if(inValue > myValue){ //If value is greater than root then it is a right side node.
     if(right == null){ //if there isn't  a right node already then it creates one using value
       right = new myBinarySearchTreeNode(inValue);
     }else{
       right.insert(inValue);
     }
   }else{
     if(left == null){ //If value is less than root then it is a left side node.
       left = new myBinarySearchTreeNode(inValue); //if there isn't  a left node already then it creates one using value
     }else{
       left.insert(inValue);
     }

   }
    }
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken. 
    
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
    int rightH = 0;
    int leftH = 0;
    if(left != null) { //goes through left side of tree and checks height.
      leftH += left.height(); //adds to counter
    }
    if(right != null) {  //goes through right side of tree and checks height.
      rightH += right.height(); //adds to counter.
    }
    if(right == null && left == null){ //if it reaches an end then it doesnt add to count.
      return 0;
    }else {
      if (rightH > leftH) { //which ever side had the largest will be returned.
        return rightH + 1;
      } else {
        return leftH + 1;
      }
    }
  }
  
  public int depth(int search){
    if(search < myValue){
      return left.depth(search) + 1 ; //if the value is not found then it further goes down tree and depending if value is greater or less than  root.
    }//also adds to count
    if(search > myValue){
      return right.depth(search) + 1; //if the value is not found then it further goes down tree and depending if value is greater or less than  root.
    }//also adds to count
    if(search == myValue){ // base case. if value is found then it returns and method found depth.
      return 0;
    }
    return -1;
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursie calls).
  }
  public int size(){
    // This method recursively calculates the number of nodes in the (sub)tree.
    int sum = 1;  //takes count for current node.
    if(left != null) {  //if left exists then it adds to count
      sum += left.size();
    }
    if(right != null) { //if right exists then it adds to count
      sum += right.size();
    }
    return sum;  // returns total sum
  }



  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
