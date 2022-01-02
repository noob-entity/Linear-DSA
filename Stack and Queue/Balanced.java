import java.util.Stack;

public class Balanced{
   public static boolean isDuplicate(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
            st.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='}'){
                if(st.isEmpty())
                return false;
            char c=st.peek();
            if(!isMatch(c,str.charAt(i)))
            return false;
            st.pop();
            }
   }
    
        return st.isEmpty();

    }
    public static boolean isMatch(char c,char ch){
        if(c=='{'&&ch=='}')
        return true;
        else if(c=='['&&ch==']')
        return true;
        else if(c=='('&&ch==')')
        return true;
        else return false;
    }
}
