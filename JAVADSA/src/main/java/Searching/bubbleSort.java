package Searching;

public class bubbleSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		
		
	System.out.println(search(intArray,7));

	}

	private static int search(int[] arr, int target) {


		int left=0;
		int right=arr.length -1;
		int mid=0;
		
		while (left<=right) {
			mid=(left+right)/2;
			if(arr[mid]== target) {
				return mid;
			} else if (target <arr[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
		
	}

}
