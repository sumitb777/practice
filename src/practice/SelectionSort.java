package practice;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
		//selection sort 
		int a[]= {21,55,77,11,52,10,54,}; 
		                                    //String [] a={"sumit","niin","aakash","sankket","a","dert"};
		//int min;
		//int temp=0;  //
		                                    // String temp="";
		for (int i=0;i<a.length;i++) {
			
			//min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i]) {  
				                                //if(a[j].compareTo(a[min]) <0);{
					//min=j;          
				                                //  min=j;
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;}}
				
			}for(int k=0;k<a.length;k++) {
				System.out.print(a[k]+" ");
				}
			
			
		}
	
	}

