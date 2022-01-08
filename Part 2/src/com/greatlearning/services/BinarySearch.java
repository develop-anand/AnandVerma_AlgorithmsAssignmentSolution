package com.greatlearning.services;

public class BinarySearch {

	public void searchValue (double priceArr[], double key) {
		int left = 0;
		int right = priceArr.length-1;
		int mid = left + (right - left) / 2;
		
		while (left <= right) {
			
			if (key < priceArr[mid]) {
				right = mid - 1;
				
			}else if (key > priceArr[mid]) {
				left = mid +1;
			
			}else {
				System.out.println("Stock of Value " + key + " is present");
				break;
			}
			mid = left + (right - left) / 2;
		}
			if (left > right ) {
			
				System.out.println("Value not found");
		}
	}
	
}
