package com.sort.demo;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0]=33;
		arr[1]=29;
		arr[2]=6;
		arr[3]=9;
		arr[4]=8;
		arr[5]=1;
		arr[6]=56; 
		arr[7]=8;
		arr[8]=0;
		arr[9]=100;
		System.out.println("Before Sorting :- " +Arrays.toString(arr));
		int[] bubbleArray = BubbleSort.sort(arr);
		int[] selectionArray = SelectionSort.sort(arr);
		int[] insertionArray = InsertionSort.sort(arr);
		int[] mergeArray = MergeSort.sort(arr);
		int[] quickArray = QuickSort.sort(arr);
		System.out.println("After Bubble Sorting :- " +Arrays.toString(bubbleArray));
		System.out.println("After Selection Sorting :- " +Arrays.toString(selectionArray));
		System.out.println("After Insertion Sorting :- " +Arrays.toString(insertionArray));
		System.out.println("After Merge Sorting :- " +Arrays.toString(mergeArray));
		System.out.println("After Quick Sorting :- " +Arrays.toString(quickArray));
		
	}

}
