package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
	public static void rev(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		int n=sc.nextInt();
//		int[] arr= {1,2,3,4,5};
//		int pos=1;
//		int[] newArr=new int[arr.length+1];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(i<pos) {
//				newArr[j]=arr[i];
//				j++;
//			}
//			else if(i==pos) {
//				newArr[j]=30;
//				j++;
//			}
//			else {
//				newArr[j]=arr[i];
//				j++;
//			}
//			
//		}
		int[] arr= {1,2,3,3,4,5,3,6};
		int pos=3;
//		int count=0;
//		boolean found=false;
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]==pos) {
//				count++;
//			}
//		}
		int count=0;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==pos) {
				count++;
			}
			else {
				arr[j]=arr[i];
				j++;
			}
			
		}
		for(int i=0;i<arr.length-count;i++) {
			System.out.println(arr[i]);
		}
//		
//		arr[arr.length-1]=0;
//		int k=3;
//		int[] arr1= {1,2,3,4,5,6,7};
//		rev(arr1,0,k-1);
//		rev(arr1,k,arr1.length-1);
//		rev(arr1,0,arr1.length-1);
//		
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
		
		
		

	}

}
