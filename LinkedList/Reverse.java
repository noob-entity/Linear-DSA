//pointer iterative
public void reversePI(){
    Node curr=head;
    Node pre=null;
    while(curr!=null){
        Node node=curr.next;
        curr.next=pre;
        pre=curr;
        curr=node;
        
    }
        Node temp=head;
    head=tail;
    tail=temp;
  }

  //data iterative
  public Node getNodeAt(int idx) {
   
    Node temp = head;
    for (int i = 0; i < idx; i++) {
      temp = temp.next;
    }
    return temp;
  
}


public void swap(Node n1,Node n2){
    int temp=n1.data;
    n1.data=n2.data;
    n2.data=temp;
}

public void reverseDI() {
  int left=0,right=size-1;
  while(left<right){
  Node lnode=getNodeAt(left);
  Node rnode=getNodeAt(right);
  swap(lnode,rnode);
  left++;
  right--;
  }
}

//pointer recursive
private void reversePRHelper(Node node){
    if(node.next==null) return;
    reversePRHelper(node.next);
    node.next.next=node;
     
    
  }

  public void reversePR(){
   reversePRHelper(head);
   Node temp=head;
    head=tail;
    tail=temp;
    tail.next=null;
    
  }
  Node left;
  public void reverseHelper(Node right,int count){
      if(right==null) return;
      reverseHelper(right.next,count+1);
      if(count>=size/2){
          swap(left,right);
      
      left=left.next;
      }
  }

  public void reverseDR() {
    left=head;
    reverseHelper(head,0);
  }