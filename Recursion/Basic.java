//Print Decreasing
/**
 * Basic
 */
public class Basic {

    

public static void printDecreasing(int n){
    if(n==0)
    return;
    
    //my work
    System.out.println(n);
    //faith
    printDecreasing(n-1);
    
}
//Print Increasing
public static void printIncreasing(int n) {
    if (n == 0)
       return;

   printIncreasing(n - 1);
   System.out.println(n);
}
//Print Increasing Decreasing
public static void pdi(int n){
    if(n==0)
    return;
    //my work
    System.out.println(n);//1
    //faith
    pdi(n-1);//2
    
    System.out.println(n);
    
    
}
//Power-linear
public static int power(int x, int n){
    if(n==0)
    return 1;
    //faith
   int p= power(x,n-1);
   //my work
  return p*x;
}
//Power-logarithmic
public static int powerr
(int x, int n) {
    if (n == 0) {
        return 1;
    }
    int p=power(x,n/2);
    if (n % 2 == 0)
        return p * p;
    else
        return p * p* x;


}
//Print Zigzag
// Input2 -> 2
// Output2 -> 2 1 1 1 2 1 1 1 2

// Input2 -> 3
// Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
public static void pzz(int n) {
    if(n==0)
    return;
    System.out.print(n+" ");
    pzz(n-1);
    System.out.print(n+" ");
    pzz(n-1);
    System.out.print(n+" ");

}
// Tower Of Hanoi
public static void toh(int n, int t1, int t2, int t3) {
    if(n==0)
    return;
    toh(n-1,t1,t3,t2);
    System.out.println(n+"["+t1+" -> "+t2+"]");
    toh(n-1,t3,t2,t1);

}
}
