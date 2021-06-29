  public static  boolean isDuplicate(String str){
        Stack<Character> st=new Stack<>();
        //st.push(str.charAt(0));
        int i=0;
        while(str.length()>i){
            if(str.charAt(i)=='('){
            st.push(str.charAt(i));
            i++;
            }
            else if(str.charAt(i)==')'){
                if(st.peek()=='(')
                return true;
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
                i++;
            }
            else{
                st.push(str.charAt(i));
                i++;
            }
            
            
        }
    
    return false;
    }
