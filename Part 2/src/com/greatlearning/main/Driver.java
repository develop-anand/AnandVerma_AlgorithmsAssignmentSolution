package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.BinarySearch;
import com.greatlearning.services.LinearSearch;
import com.greatlearning.services.MergeSortImplementation;
import com.greatlearning.services.Services;

public class Driver {

	public static void main(String[] args) {
		
		int noOfCompanies, option;
		
		System.out.println("Enter the number of Companies : ");
		
		Scanner obj = new Scanner(System.in);
		
		noOfCompanies =  obj.nextInt();
		
		double priceArr[] = new double[noOfCompanies];
		
		boolean profitArr[] = new boolean[noOfCompanies];
		
		
		for (int i = 0; i<noOfCompanies; i++) {
			
			System.out.println("Enter current Stock price of Company "+ (i + 1));
			priceArr[i] = obj.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			profitArr[i] = obj.nextBoolean();
			
		}
		
		
		MergeSortImplementation mergeSort = new MergeSortImplementation();
		mergeSort.sort(priceArr, 0, priceArr.length-1);
		
		Services services = new Services();
		
		LinearSearch linearSearch = new LinearSearch();
		
		BinarySearch binarySearch = new BinarySearch();
		
		do {
			System.out.println("__________________________________");
			System.out.println("Enter the operation that you want to perform :");
			System.out.println("1. Display the companies stock prices in ascending order ");
			System.out.println("2. Display the companies stock prices in descending order ");
			System.out.println("3. Display the total no of companies for which stock prices rose today ");
			System.out.println("4. Display the total no of companies for which stock prices declined today ");
			System.out.println("5. Search a specific stock price ");
			System.out.println("6. press 0 to exit ");
			System.out.println("_________________________________");
			
			option = obj.nextInt();
			switch (option) {
			
			case 0:
				option = 0;
				break;
				
			case 1:{
				services.displayPriceAscending(priceArr);
			}break;
			
			case 2:{
				services.displayPriceDescending(priceArr);
			}break;
			case 3:{
				System.out.println("Total no of companies whose stock price rose today : "
						+ linearSearch.countCompaniesInProfit(profitArr));
			}break;
			case 4:{
				System.out.println("Total no of companies whose stock price declined today : " 
			+ (noOfCompanies - linearSearch.countCompaniesInProfit(profitArr)));
			
			}break;
			case 5:{
				double key;
				System.out.println("Enter the Key Value ");
				key = obj.nextDouble();
				binarySearch.searchValue(priceArr, key);
			
			}break;
			
			default:
				System.out.println("Enter valid Option");
				
		}
		

		}while (option != 0);
		System.out.println("Exited Succesfully ");
		obj.close();
}
}
