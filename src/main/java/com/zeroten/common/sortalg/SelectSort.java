package com.zeroten.common.sortalg;

public class SelectSort {
    private static final int SIZE = 10;
    public static void selectSort(int[] a){
        int index;
        int temp;
        for(int i = 0; i < a.length-1; i++) {
            index = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[index]) {
                    index = j;
                }
            }
            if(index != i){
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
            System.out.printf("第%d步排序结果为：",i+1);
            for(int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for(int i = 0; i < SIZE; i++) {
            array[i] = (int)(100 + Math.random()*100);
        }
        System.out.println("排序前的数组为：");
        for(int num:array){
            System.out.print(num + "\t");
        }
        System.out.println();

        selectSort(array);

        System.out.println("排序后的数组为：");
        for(int num:array){
            System.out.print(num + "\t");
        }
    }
}
