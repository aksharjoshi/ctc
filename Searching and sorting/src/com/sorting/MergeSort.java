package com.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSort ob = new MergeSort();
		
		int a[] = {21,2,45,67,87,4,7,1};
		System.out.println("before sort: ");
		
		for(int i: a){
			System.out.print(i+" ");
		}
		ob.mergeSort(a);
		
		
	}

	public void mergeSort(int arr[]){
		int [] helper = new int[arr.length];
		mergeSortMain(arr, helper, 0, arr.length-1);
		System.out.println("\nafter sort: ");
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
	
	public void mergeSortMain(int[] arr, int[] helper, int low, int high){
		if(low < high){
			int mid = (low + high) / 2;
			mergeSortMain(arr, helper, low, mid);
			mergeSortMain(arr, helper, mid+1, high);
			mergeArr(arr, helper, low, mid, high);
			
		}
	}

	private void mergeArr(int[] arr, int[] helper, int low, int mid, int high) {
		// TODO Auto-generated method stub
		for(int i = low; i <= high; i++){
			helper[i]=arr[i];
		}
		
		int current = low;
		int leftHelper = low;
		int rightHelper = mid+1;
		
		while(leftHelper <= mid && rightHelper <= high){
			if(helper[leftHelper] <= helper[rightHelper]){
				arr[current] = helper[leftHelper];
				leftHelper++;
			}
			else{
				arr[current] = helper[rightHelper];
				rightHelper++;
			}
			current++;
		}
		
		int remaining = mid - leftHelper;
		
		for(int i=0; i<=remaining; i++){
			arr[current+i] = helper[leftHelper+i];
		}
		
	}
}
