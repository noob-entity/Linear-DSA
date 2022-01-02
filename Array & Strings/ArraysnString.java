public class ArraysnString {
    //long pressed key
    
    public static boolean isPossible(String name, String typed) {
        // Write your code here
        int i=0,j=0;
        if(name.length()>typed.length()) return false;
        while(i<name.length()&&j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            } else {
                if(i-1>=0&&name.charAt(i-1)==typed.charAt(j)){
                  j++;
               } 
                 else return false;
            }
            
        }
        while(j<typed.length()){
            if(name.charAt(i-1)!=typed.charAt(j)) return false;
            j++;
        }
        return i==name.length();
    }

}
