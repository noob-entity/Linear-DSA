/**
 * FoldList
 */
public class FoldList {

  

Node left;
public void foldHelper(Node right, int count){
    if(right==null) return;
    foldHelper(right.next,count+1);
    if (count > size / 2) {
      Node temp = left.next;
      left.next = right;
      right.next = temp;

      left = temp;
    } else if(count == size / 2){
      tail = right;
      tail.next = null;
    }
    
}
  public void fold() {
    left=head;
    foldHelper(head,0);
   
    
  }

  public static void fold(ListNode head) {
    if(head==null||head.next==null) return;
    ListNode mid=midNode(head);
    ListNode c1=head,c2=reverse(mid.next);
    mid.next=null;
    while(c2!=null){
        ListNode f1=c1.next,f2=c2.next;
        c1.next=c2;
        c2.next=f1;
        c1=f1;
        c2=f2;
    
    }

}}
