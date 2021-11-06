public static void unfold(ListNode head) {
    if(head==null||head.next==null) return;
     
     ListNode c1 = head, c2 = head.next, nHead = c2;
     while (c2 != null && c2.next != null) {
         ListNode f1 = c2.next;

         c1.next = f1;
         c2.next = f1.next;

         c1 = c1.next; 
         c2 = c2.next; 
     }

     c1.next = null;
     nHead = reverse(nHead);
     c1.next = nHead;

}