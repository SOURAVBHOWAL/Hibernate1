package OneDArray;

public class ThirdLargest {
	
	public static int ThirdLargestElement(int[] arr) {
		int max=arr[0],smax=0,tmax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				tmax=smax;
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]!=max) {
				tmax=smax;
				smax=arr[i];
			}
			else if(arr[i]>tmax && arr[i]!=smax && arr[i]!=max) {
				tmax=arr[i];
			}
		}
		return tmax;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,5,6,6,4};
		

	}

}
