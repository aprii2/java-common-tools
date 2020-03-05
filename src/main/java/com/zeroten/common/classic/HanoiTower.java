package com.zeroten.common.classic;

import java.util.Scanner;

public class HanoiTower {
    // 汉诺塔——典型的递归算法问题
    private static int count = 0;
    public static void hanoi(int n,char a,char b,char c){
        if(n == 1){
            System.out.printf("第%d次移动：圆盘从%c棒移动到%c棒%n",++count,a,c);
        }else{
            hanoi(n-1,a,c,b);
            System.out.printf("第%d次移动：圆盘从%c棒移动到%c棒%n",++count,a,c);
            hanoi(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        System.out.println("***汉诺塔问题求解***");
        System.out.println("请输入汉诺塔圆盘的数量：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        hanoi(n,'A','B','C');
        System.out.printf("求解完毕，总共需要%d步移动！",count);
    }
}
