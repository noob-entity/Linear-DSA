public int mid(){
        
    Node slow=head;
    Node fast=head;
    while(fast.next!=null&&fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow.data;
    
  }