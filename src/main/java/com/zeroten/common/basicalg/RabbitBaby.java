package com.zeroten.common.basicalg;

import java.util.Scanner;

public class RabbitBaby {
    // 递推算法

    public static int Fibonacci(int n) {
        int t1,t2;
        if(n == 1 || n == 2) {
            return 1;
        }else{
            t1 = Fibonacci(n-1);
            t2 = Fibonacci(n-2);
            return t1 + t2;
        }
    }

    public static void main(String[] args) {
        System.out.println("***递推算法求解兔子产仔问题***");
        System.out.println("请输入时间（月为单位）:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int result = Fibonacci(month);
        System.out.printf("经过%d个月时间，共有%d对兔子",month,result);
    }
}
