package com.zeroten.common.basicalg;

import java.util.Scanner;

public class ChicknRabbit {
    // 穷举算法
    private static int rabbit;
    private static int chicken;

    public static int qiongJu(int head,int foot){
        int j;
        for(int i = 0; i <= head; i++) {
            j = head - i;
            if(i*4 + j*2 == foot) {
                rabbit = i;
                chicken = j;
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("穷举法求解鸡兔同笼问题：");
        System.out.println("请输入鸡兔总数：");
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();
        System.out.println("请输入鸡兔的脚数：");
        int foot = sc.nextInt();
        int result = qiongJu(head,foot);
        if(result == 1){
            System.out.printf("鸡有%d只，兔有%d只",chicken,rabbit);
        }else{
            System.out.println("无法求解");
        }
    }
}
