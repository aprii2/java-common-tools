package com.zeroten.common.searchalg;

import java.util.Scanner;

public class SearchFun {
    // 顺序查找算法
    private static final int NUM = 10;

    public static int searchFun(int[] a,int x) {
        for(int i = 0; i < a.length; i ++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int[] a){
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[NUM];
        for(int i = 0;i < array.length; i++) {
            array[i] = (int)(100 + Math.random()*100);
        }
        System.out.println("***顺序查找算法演示***");
        System.out.print("数据序列为：");
        print(array);
        System.out.print("请输入要查找的数：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = searchFun(array,target);

        if(index == -1){
            System.out.printf("没找到数据：%d%n",target);
        }else {
            System.out.printf("数据：%d位于数组的第%d个元素处",target,index + 1);
        }
    }
}
