public static ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null) return null;
    ListNode fast=head,slow=head;
    while(n-->0){
        fast=fast.next;
        
    }
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    if(fast==null){
        ListNode rnode=slow;
        head=rnode.next;
        rnode.next=null;
        return head;
    }
    slow.next=slow.next.next;
    return head;
  }