package com.zeroten.common.sortalg;

public class InsertionSort {
    private static final int NUM = 10;

    public static void print(int[] a) {
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++) {
            for(int j = 0;j < i; j++) {
                if(a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.printf("第%d步排序结果为：",i);
            print(a);
        }
    }


    public static void main(String[] args) {
        int[] array = new int[NUM];
        for(int i = 0; i < NUM; i++) {
            array[i] = (int) (100 + Math.random()*100);
        }
        System.out.println("插入排序前数组元素为：");
        print(array);
        System.out.println("插入排序过程如下：");
        insertionSort(array);
        System.out.println("插入排序后数组元素为：");
        print(array);
    }
}
