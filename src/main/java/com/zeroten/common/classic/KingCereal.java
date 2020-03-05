package com.zeroten.common.classic;

public class KingCereal {
    // 舍罕王赏麦
    // 8x8的棋盘
    // 第一格赏1粒
    // 第二格赏2粒
    // 第三格赏4粒
    // 64个格子的麦子全部赏给宰相
    public static double cereal(int n){
        if(n == 1) return 1;
        else return 2 * cereal(n-1);
    }

    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 64; i++) {
            sum = sum + cereal(i);
        }
        System.out.printf("一共要赏%.2f粒麦子%n",sum);
        System.out.printf("一共要赏%.2f吨麦子",sum/25000/1000);
    }
}
