//Display Array
public static void displayArr(int[] arr, int idx) {
    if(idx==arr.length)
    return;
    
    System.out.println(arr[idx]);
    displayArr(arr,idx+1);

}
// Display Array In Reverse
public static void displayArrReverse(int[] arr, int idx) {
    if (idx ==arr.length)
        return;

    
    displayArrReverse(arr, idx +1);
    System.out.println(arr[idx]);

}
//Max Of An Array

public static int maxOfArray(int[] arr, int idx) {
    int maxx = arr[0];
    if (idx == arr.length) {
        return Integer.MIN_VALUE;
    }
    maxx = maxOfArray(arr, idx + 1);
    if (arr[idx] > maxx)
        maxx = arr[idx];
    return maxx;

}
//First Index
public static int firstIndex(int[] arr, int idx, int x) {
    if(idx==arr.length)
    return -1;
    
    if(arr[idx]==x)
    return idx;
   return firstIndex(arr,idx+1,x);
}
//Last Index

public static int lastIndex(int[] arr, int idx, int x) {
    if (idx ==arr.length)
        return -1;

    int isa=lastIndex(arr, idx +1, x);
    if (isa!=-1)
        return isa;
    if(arr[idx]==x)
    return idx;
    else
    return -1;

}
// All Indices Of Array
public static int[] allIndices(int[] arr, int x, int idx, int count) {
    // write ur code here
    if(idx==arr.length){
        int [] ba=new int[count];
        return ba;
    }
    if(arr[idx]==x){
        count++;
    }
    int rr[]=allIndices(arr,x,idx+1,count);
    if(arr[idx]==x){
        rr[count-1]=idx;
    }

  return rr;
}