/**
 * addtwolist
 */
public class addtwolist {

    

public static int addHelper(Node one,int pv1,Node two,int pv2,LinkedList res){
    if(one==null&&two==null)
    return 0;
    int data=0;
    if(pv1>pv2){
         int oc=addHelper(one.next,pv1-1,two,pv2,res);
        data=one.data+oc;
    } else if(pv1<pv2){
         int oc=addHelper(one,pv1,two.next,pv2-1,res);
        data=two.data+oc;
        
    } else{
        int oc=addHelper(one.next,pv1-1,two.next,pv2-1,res);
        data=one.data+two.data+oc;
       
    }
    int nd=data%10;
       int nc=data/10;
        res.addFirst(nd);
        return nc;
}

public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
  LinkedList res=new LinkedList();
  int oc=addHelper(one.head,one.size,two.head,two.size,res);
  if(oc!=0){
      res.addFirst(oc);
  }
  return res;
  
}
}