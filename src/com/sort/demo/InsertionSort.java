package com.sort.demo;

public class InsertionSort {
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
