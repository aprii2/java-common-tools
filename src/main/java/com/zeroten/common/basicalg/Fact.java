package com.zeroten.common.basicalg;

import java.util.Scanner;

public class Fact {
    // 递归实现自然数的阶乘
    public static long fact(int n){
        if(n <= 1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入要求阶乘的一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("自然数%d的阶乘结果是：%d",num,fact(num));
    }
}
