package OneDArray;

import java.util.Arrays;

public class OneDArrayInsert {

	public static void main(String[] args) {
		int[] a1= {101,105,110,120,130};
		int[] a2=new int[a1.length+1];
		int newVal=107;
		boolean flag=false;
		int j=0;
		for(int i=0;i<=a1.length;i++) {
			if(a1[j]<newVal && !flag) {
				a2[i]=a1[j++];
			}
			else if(!flag && a1[j]>newVal) {
				a2[i]=newVal;
				flag=true;
			}
			else {
				a2[i]=a1[j++];
			}
		}
		System.out.println(Arrays.toString(a2));

	}

}
