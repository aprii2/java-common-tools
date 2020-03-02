package com.zeroten.common.sortalg;

public class BubbleSort {
    private static final int NUM = 10;
    public static void bubbleSort(int[] a){
        for(int i = 1; i < a.length ; i++) {
            for(int j = 0; j < a.length - i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.printf("第%d步排序结果是：",i);
            for(int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[NUM];
        for(int i = 0; i < NUM; i++) {
            array[i] = (int)(100 + Math.random()*100);
        }
        System.out.print("排序前的数组为：");
        for(int i = 0; i < NUM; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 冒泡排序
        BubbleSort.bubbleSort(array);

        System.out.print("排序后的数组为：");
        for(int i = 0; i < NUM; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
