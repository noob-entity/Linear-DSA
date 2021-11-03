void addLast(int val) {
    size++;
    Node nnode=new Node();
    nnode.data=val;
   
    if(head==null) head=tail=nnode;
    else {tail.next=nnode;
    tail=nnode;
    }
  
  }

  public void addFirst(int val) {
    size++;
    Node nn=new Node();
    nn.data=val;
    nn.next=null;
    if(head==null) head=tail=nn;
    else{
        nn.next=head;
        head=nn;
    }
  }


  public void addAt(int idx, int val){
    if(idx<0||idx>size) System.out.println("Invalid arguments");
    else if(idx==0) addFirst(val);
    else if(idx==size) addLast(val);
    else{
     Node temp=head;
     Node nn=new Node();
     nn.data=val;
     nn.next=null;
     size++;
        while(idx-->1){
        temp=temp.next;
        } 
    nn.next=temp.next;
    temp.next=nn;
    }
}


public void removeFirst(){
    if(head==null){ 
        System.out.println("List is empty");
         return;
    }
    
  
    if(size==1) head=tail=null;
    else{
        head=head.next;
    }
    size--;
  }

  public void removeLast(){
     
    if(head==null){ 
        System.out.println("List is empty");
         return;
    }
    
  
    if(size==1) head=tail=null;
    else{
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
    }
    size--;
  }

  public void removeAt(int idx) {
    if(idx<0||idx>=size){
        System.out.println( "Invalid arguments");
        return;
        
    }
     if(head==null){ 
         System.out.println("List is empty");
          return;
     }
     if(idx==0) removeFirst();
     else if(idx==size-1) removeLast();
     else{
         Node temp=head;
           while(idx-->1){
             temp=temp.next;
           }
         temp.next=temp.next.next;
          size--;
       
     }
   }