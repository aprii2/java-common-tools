package com.zeroten.common.classic;

import java.util.Scanner;

public class MonkeyPeach {
    // 猴子吃桃问题
    // 猴子摘了一堆桃子，每天吃掉其中的一半然后再多吃一个
    // 第二天则吃剩余的一半然后再多吃一个……
    // 直到第10天，猴子发现只有1个桃子。
    // 问猴子在第一天摘了多少个桃子？

    public static int peach(int n){
        if(n == 1) {
            return 1;
        }else return 2*peach(n - 1) + 2;
    }

    public static void main(String[] args) {
        System.out.println("请输入猴子吃桃的天数：");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int peaches = peach(day);
        System.out.printf("最初猴子摘了%d个桃子",peaches);
    }

}
