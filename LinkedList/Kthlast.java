public int kthFromLast(int k){
    Node slow=head;
    Node fast=head;
    while(k-->0){
        fast=fast.next;
    }
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
        
    }
    return slow.data;
  }