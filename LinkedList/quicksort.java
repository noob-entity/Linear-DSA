/**
 * quicksort
 */
public class quicksort {

  

public static ListNode segregateOnLastIndex(ListNode head) {
    if(head==null)
    return null;
    ListNode pivot=head;
    while(pivot.next!=null){
        pivot=pivot.next;
    }
    ListNode small=new ListNode(-1);
    ListNode large=new ListNode(-1);
    ListNode sp=small,lp=large,curr=head;
    while(curr!=null){
        if(curr.val<=pivot.val){
            sp.next=curr;
            sp=sp.next;
        } else{
            lp.next=curr;
            lp=lp.next;
            
        }
        curr=curr.next;
    }
    sp.next=large.next;
    lp.next=null;
    head=small.next;
    return sp;
    
}

public static ListNode segregateOverPivot(ListNode head, int pivotIdx) {
    ListNode pivotNode = head;
    while (pivotIdx-- > 0)
      pivotNode = pivotNode.next;

    ListNode large = new ListNode(-1), small = new ListNode(-1), sp = small, lp = large, curr = head;
    while (curr != null) {
      if (curr != pivotNode && curr.val <= pivotNode.val) {
        sp.next = curr;
        sp = sp.next;
      } else if (curr != pivotNode) {
        lp.next = curr;
        lp = lp.next;
      }
      curr = curr.next;
    }
    sp.next=pivotNode;
    pivotNode.next=large.next;
    lp.next=null;
    head=small.next;
    return head;
  }
}