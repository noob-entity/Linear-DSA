public static ListNode segregateEvenOdd(ListNode head) {
    if(head==null||head.next==null)
    return null;
    
    ListNode odd=new ListNode(-1);
    ListNode even=new ListNode(-1);
    ListNode ep=even,op=odd,curr=head;;
    
    
    while(curr!=null){
        if(curr.val%2==0){
            ep.next=curr;
            ep=ep.next;
        } else{
             op.next=curr;
            op=op.next;
        }
        curr=curr.next;
    }
     ep.next=odd.next;
     op.next=null;
     head=even.next;
     return head;
     
    
}

public static ListNode segregate01(ListNode head) {
    if(head==null||head.next==null) return null;
    
    ListNode zero=new ListNode(-1);
    ListNode one=new ListNode(-1);
    ListNode zp=zero,op=one,curr=head;
    while(curr!=null){
        if(curr.val==0){
           zp.next=curr;
           zp=zp.next;
        } else{
            op.next=curr;
            op=op.next;
            
        }
        curr=curr.next;
    }
    
    zp.next=one.next;
    op.next=null;
    head=zero.next;
    zero.next=one.next=null;
    return head;
}