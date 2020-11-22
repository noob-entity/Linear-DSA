class SmallestAndLargest
{
   
    public static void SmallAndLarge(Node head)
    {
        
        //Code here
        Node temp=head;
        int l=head.data,s=head.data;
        while(temp!=null){
        if(temp.data>l){
            l=temp.data;
        }
        else if(temp.data<s){
            s=temp.data;
        }
        else
        temp=temp.next;
        
        }
        System.out.println(s+" "+l);
    
    }
}