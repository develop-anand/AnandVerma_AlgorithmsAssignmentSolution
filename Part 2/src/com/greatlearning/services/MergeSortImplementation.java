package com.greatlearning.services;

public class MergeSortImplementation {

	void merge(double arr[],int left, int mid, int right) {
		
		int no1 = mid - left + 1;
		int no2 = right- mid;
		
		double leftArray[] = new double[no1];
		double rightArray[] = new double[no2];
		
		for (int i = 0; i<no1; ++i)
			leftArray [i] = arr[left + i];
			
		for (int j = 0; j<no2; j++)
			rightArray[j] = arr[mid +1 + j]; 
			
		
		int i =0, j = 0;
		
		int k = left;
		
		while (i<no1 && j<no2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			
			}else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while (i < no1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while (j < no2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	public void sort (double arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			
			sort (arr,left,mid);
			sort (arr, mid +1, right);
			merge (arr,left,mid,right);
		}
	}
	
}
