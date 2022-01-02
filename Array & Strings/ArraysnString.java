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
    //Container With Most Water
    public static int mostWater(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxWater=Integer.MIN_VALUE;
        
        while(i<j){
               int water=(j-i)*Math.min(heights[i],heights[j]);
            maxWater=Math.max(water,maxWater);
            if(heights[i]<heights[j]){
                i++;
            } else{
                j--;
            }
        
        }
        return maxWater;
    }
    // Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans[]=new int[nums.length];
        int k=nums.length-1;;
        while(k>=0){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[k]=nums[i]*nums[i];
                i++;
            } else{
                ans[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return ans;
    }
    //Majority Element

    public int majorityElement(int[] nums) {
        int val=nums[0];
        int count=1;
        int i=1;
        while(i<nums.length){
            if(val==nums[i]){
                count++;
            } else{
                if(count>0) count--;
                else{
                val=nums[i];
                count=1;
                }
            }
            i++;
        }
        
        return val;
        
    }
    private boolean isMajority(int[] arr, int val) {
        int count = 0;
        for(int ele : arr) {
            if(val == ele)
                count++;
        }
        return count > arr.length / 3;
    }
    //Majority Element II
    public List<Integer> majorityElement2(int[] nums) {
        int val1=nums[0];
        int val2=nums[0];
        int count1=1;
        int count2=0;
        int i=1;
        while(i<nums.length){
          if(nums[i]==val1){
             count1++; 
          } else if(nums[i]==val2){
              count2++;
          } else{
              if(count1==0){
                  val1=nums[i];
                  count1=1;
              } else if(count2==0){
                  val2=nums[i];
                  count2=1;
              } else{
                  count1--;
                  count2--;
              }
          }
            i++;
        }
         List<Integer> res = new ArrayList<>();

        // check if val1 and val2 present in majority or not
        if(isMajority(nums, val1)) {
            res.add(val1);
        } 

        if(val1 != val2 && isMajority(nums, val2)) {
            res.add(val2);
        }
        return res;
    }

}
