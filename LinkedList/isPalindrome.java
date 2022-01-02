/**
 * isPalindrome
 */
public class isPalindrome {

    

Node left;
public boolean isPalindromeHelper(Node right){
    if(right==null) return true;
    boolean rr=isPalindromeHelper(right.next);
    if(!rr||left.data!=right.data) return false;
    left=left.next;
    return true;
}
 public boolean IsPalindrome() {
   // write your code here
   left=head;
return  isPalindromeHelper(head);
 }
 public static boolean isPalindrome(ListNode head) {
    if(head==null||head.next==null)
        return true;
    ListNode mid=midNode(head); 
    ListNode l2=reverse(mid.next);
    mid.next=null;
    ListNode l1=head;
    while(l2!=null){
        if(l1.val!=l2.val) return false;
        l1=l1.next;
        l2=l2.next;
    }
    
    return true;
    
}}