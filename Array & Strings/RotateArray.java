import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
    static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }
    static void rotate(int arr[],int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            rotate(arr,d);
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}