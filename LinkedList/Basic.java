/**
 * Basic
 */
public class Basic {

    

public void display(){
    // write code here
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
     System.out.println();
  }
}