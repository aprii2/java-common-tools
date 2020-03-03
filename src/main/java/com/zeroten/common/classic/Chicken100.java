package com.zeroten.common.classic;

public class Chicken100 {
    // 不定方程问题
    // 公鸡5钱一只，母鸡3钱一只，小鸡1钱3只
    // 如果用100钱买100鸡，公鸡母鸡小鸡各该买多少只？
    private static final int MONEY = 100;
    private static final int NUM = 100;
    public static void bqbj(int m,int n){
        int x,y,z;
        for(x = 0; x <= n/5; x++){
            for(y = 0; y <= n/3; y++) {
                z = n - x -y;
                if(z > 0 && z%3 == 0 && x*5 + y*3 + z/3 == m) {
                    System.out.printf("公鸡%d只，母鸡%d只，小鸡%d只%n",x,y,z);
                }else {
                }
            }
        }
    }

    public static void main(String[] args) {
        bqbj(MONEY,NUM);
    }
}
