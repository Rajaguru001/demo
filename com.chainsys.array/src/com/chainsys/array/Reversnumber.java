package com.chainsys.array;
import java.util.*;

public class Reversnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=sc.nextInt();
		while(true)
			if(n>0) {
				break;
			}
			else {
				System.out.println("Enter the positive integer:");
				n=sc.nextInt();
			}
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		

		

	}

}
