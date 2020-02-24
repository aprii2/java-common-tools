package com.zeroten.common.util;

public class ArrayUtils {
    // 1、对传入的 int 数组进行排序，从小到大。
    // 2、并返回排序后的结果。
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
