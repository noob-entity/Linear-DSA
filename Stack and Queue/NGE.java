import java.util.Stack;

/**
 * NGE
 */
public class NGE {

    

public static int[] solve(int[] arr){
   // solve
   int[] res=new int[arr.length];
   Stack<Integer> st=new Stack<>();
   res[arr.length-1]=-1;
   for(int i=arr.length-1;i>=0;i--){
       //pop all the smaller elements
       while(st.size()>0&&st.peek()<arr[i]){
           st.pop();
       }
       //update result 
       //if empty -1
       //else top of stack
       if(st.isEmpty())
       res[i]=-1;
       else
       res[i]=st.peek();
       //push current element to the stack
       st.push(arr[i]);
   }
   return res;
 }
}