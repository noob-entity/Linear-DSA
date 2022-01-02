public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1==null||l2==null) 
        return l1==null?l2:l1;
        
    ListNode dummy=new ListNode(-1);
    ListNode c1=l1,c2=l2,pre = dummy;
    while(c1!=null&&c2!=null){
        if(c1.val<=c2.val){
            pre.next=c1;
            c1=c1.next;
        } else{
            pre.next=c2;
            c2=c2.next;
            
        }
        pre=pre.next;
    }
     pre.next = c1 != null ? c1 : c2;
         ListNode head = dummy.next;
    dummy.next = null;
    return head;
}


public static ListNode mergeSort(ListNode head) {
    if (head == null || head.next == null)
      return head;

  ListNode mid = midNode(head);
  ListNode nHead = mid.next;
  mid.next = null;

  return mergeTwoLists(mergeSort(head), mergeSort(nHead));
}