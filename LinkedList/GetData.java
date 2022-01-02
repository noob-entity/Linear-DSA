/**
 * GetData
 */
public class GetData {

    

public int getFirst(){
    if(head==null) {
        System.out.println("List is empty");
        return -1;
    }
 return head.data;
}

public int getLast(){
     if(head==null) {
        System.out.println("List is empty");
        return -1;
    }
  return tail.data;
}

public int getAt(int idx){
     if(head==null) {
        System.out.println("List is empty");
        return -1;
    }
    if(idx<0||idx>size-1){
         System.out.println("Invalid arguments");
        return -1;
    }
      Node temp=head;
    while(idx-->0){
        temp=temp.next;
        
    }
    return temp.data;
  
}
}