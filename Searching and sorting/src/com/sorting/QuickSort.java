package com.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort ob = new QuickSort();
		int[] arr = {21,2,45,67,87,4,7,1};
		
		System.out.println("before sort: ");
		
		for(int i: arr){
			System.out.print(i+" ");
		}
		
		ob.quickSort(arr, 0, arr.length-1);
		
		System.out.println("\nafter sort: ");
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}

	void quickSort(int arr[], int left, int right){
		int index = partition(arr, left, right);
		
		if(left < index-1){
			quickSort(arr, left, index-1);
		}
		if(index < right){
			quickSort(arr, index, right);
		}
	}

	private int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int pivot = arr[(left+right)/2];
		
		while(left <= right){
			while(arr[left] < pivot){
				left++;
			}
			
			while(arr[right] > pivot){
				right--;
			}
			
			if(left <= right){
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				
				left++;
				right--;
			}
		}
		return left;
	}
}
