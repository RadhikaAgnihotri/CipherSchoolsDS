package arrays;

import java.util.*;

public class arraysone {
	static void fun(int arr[]){
		System.out.println("Inside fun function");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+5;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		int arr[] = new int[n];
// 		System.out.println(arr[-1]);
// 		System.out.println(arr[0]);
// 		System.out.println(arr[1]);
// 		System.out.println(arr[2]);
// 		System.out.println(arr[3]);
// 		System.out.println(arr[4]);
//        for(int i=0;i<=n-1;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        int x=5;
//        fun(x);
//        System.out.println(x);
//        int arr[]={1,2,3,4,5};
//        for(int i=1;i<arr.length;i=i+2)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        fun(arr);
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//        	sum=sum+arr[i];
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. of rows: ");
//        int p = sc.nextInt();
//        System.out.println("Enter the no. of cols: ");
//        int q = sc.nextInt();
//        int mat[][]=new int[p][q];
//        
//        for(int i=0;i<p;i++)
//        {
//	        for(int j=0;j<q;j++)
//	        {
//	        	mat[i][j] = sc.nextInt();
//	        }
//        }
//        
//        for(int i=0;i<p;i++)
//        {
//	        for(int j=0;j<q;j++)
//	        {
//	        	System.out.print(mat[i][j]+" ");
//	        }//one row gets printed
//	        System.out.println();
//        }
//        
//        System.out.println(mat.length);//rows
//        System.out.println(mat[0].length);//cols
//        
//        int a[][] =new int [4][];
////        a[0]={1,2,3,4};//cannot be used
//        a[0]= new int[]{1,2,3,4};
//        a[1]=new int[2];
//        a[2]=new int [3];
//        a[3]=new int [5];
//        
//        int b[] = {1,2,3,4};
//        b = new int[]{4,5,6,7};//anonymous array
////        b={4,5,6,7};// can be used used while declaration
        
		int i=0;
		for(i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
        System.out.println(i);
	}

}
