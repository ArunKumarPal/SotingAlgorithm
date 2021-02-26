package com.sort.demo;

import java.util.Arrays;

public class MergeSort {

	public static int[] sort(int[] arr) {
		if(arr.length <= 1){
			return arr;
		}
		else {
			int[] leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
			int[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);
			return merge(sort(leftArr),sort(rightArr));
		}
		
	}
	
	public static int[] merge(int[] leftArr,int[] rightArr){
		int leftIndex = 0;
		int rightIndex = 0;
		int[] result = new int[leftArr.length+rightArr.length];
		int resultIndex =0;
		while(leftIndex<leftArr.length && rightIndex < rightArr.length){
			if(leftArr[leftIndex]<rightArr[rightIndex]){
				result[resultIndex] = leftArr[leftIndex];
				leftIndex++;
				resultIndex++;
			}
			else {
				result[resultIndex] = rightArr[rightIndex];
				rightIndex++;
				resultIndex++;
			}
		}
		if(leftIndex<leftArr.length){
			for(;leftIndex<leftArr.length;leftIndex++){
				result[resultIndex] = leftArr[leftIndex];
				resultIndex++;
			}
		}
		if(rightIndex<rightArr.length){
			for(;rightIndex<rightArr.length;rightIndex++){
				result[resultIndex] = rightArr[rightIndex];
				resultIndex++;
			}
		}
		
		return result;
	}
	
}
