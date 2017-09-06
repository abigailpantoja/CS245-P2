
package edu.usfca.cs.cs245;
public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		
		return "Binary Recursive";
	}

	private int search(int[] arr, int target, int min, int max) {
		if(min>max)
			return -1;
		int mid = (min+max)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
			return search(arr,target,min, mid-1);
		else
			return search(arr, target, mid+1,max);
	}
	
	public int search(int[]arr, int target) {
		return search(arr,target,0,arr.length-1);
	}

	@Override
	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}
}
