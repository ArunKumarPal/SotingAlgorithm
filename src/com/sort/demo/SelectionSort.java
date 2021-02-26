package com.sort.demo;

public class SelectionSort {
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int sortItem = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[sortItem] > arr[j]) {
					// change Index
					sortItem = j;
				}
			}
			if (i != sortItem) {
				// Swap number
				int temp = arr[i];
				arr[i] = arr[sortItem];
				arr[sortItem] = temp;
			}
		}
		return arr;
	}
}
