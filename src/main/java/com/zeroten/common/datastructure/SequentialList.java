package com.zeroten.common.datastructure;

import java.util.Scanner;

/*
* 定义一个记录班级学生信息的顺序表：
* 按学生学号顺序，存放学生的学号/姓名/年龄。
* */
class DATA {                                    // 定义结点
    String key;                                 // 结点的关键字
    String name;
    int age;

    @Override
    public String toString(){
        return String.format("(%s,%s,%d)",this.key,this.name,this.age);
    }
}

class SLType{                                   // 定义顺序表结构
    static final int MAXLEN = 100;
    DATA[] ListData = new DATA[MAXLEN+1];       // 保存顺序表的结构数组，用来存放各个数据结点
    int ListLen;                                // 顺序表已存结点的数量，即当前顺序表的长度
                                                // ListLen范围1~100，从1开始计数

    void SLInit(SLType SL) {                    // 初始化顺序表
        SL.ListLen = 0;                         // 初始化为空表
    }

    int SLLength(SLType SL) {
        return SL.ListLen;                      // 返回顺序表的元素数量
    }

    int SLInsert(SLType SL,int n,DATA data) {   // 输入参数为顺序表，插入位置，结点数据
        if(SL.ListLen>=SL.MAXLEN) {
            System.out.println("顺序表已满，不能插入结点");
            return 0;                           // 返回0表示插入不成功
        }
        if(n<1 || n>SL.ListLen-1){              // 插入结点序号不正确
            System.out.println("插入元素序号错误，不能插入元素！");
            return 0;                           // 返回0表示插入不成功
        }
        for(int i = SL.ListLen; i >= n; i--) {  // 将顺序表中的数据向后移动
            SL.ListData[i+1] = SL.ListData[i];
        }
        SL.ListData[n] = data;                  // 插入结点
        SL.ListLen++;                           // 顺序表结点数量增加1
        return 1;                               // 成功插入，返回1
    }

    int SLAdd(SLType SL,DATA data) {            // 增加元素到顺序表尾部
        if(SL.ListLen >= SL.MAXLEN) {             // 顺序表已满
            System.out.println("顺序表已满，不能再添加结点了");
            return 0;
        }
        SL.ListData[++SL.ListLen]=data;         // 顺序表元素数量+1
        return 1;                               // 成功追加，返回1
    }

    int SLDelete(SLType SL,int n){              // 输入参数为顺序表，删除元素位置
        if(n<1 || n>SL.ListLen) {               // 删除结点序号不正确
            System.out.println("删除结点序号错误，不能删除结点！");
            return 0;                           // 删除不成功，返回0
        }
        for(int i = n;i < SL.ListLen;i++) {     // 将顺序表中的数据向前移
            SL.ListData[i] = SL.ListData[i+1];
        }
        SL.ListLen--;                           // 顺序表元素数量减1
        return 1;                               // 成功删除，返回1
    }

    DATA SLFindByNum(SLType SL,int n) {         // 根据序号返回数据元素
        if(n<1 || n>SL.ListLen) {               // 元素序号不正确
            System.out.println("结点序号错误，不能返回结点！");
            return null;                        // 不成功，则返回null
        }
        return SL.ListData[n];
    }

    int SLFindByCont(SLType SL,String key){     // 按照关键字查询结点
        for(int i= 1;i <= SL.ListLen;i++) {
            if(SL.ListData[i].key.compareTo(key)==0){
                return i;                       // 如果找到返回结点序号
            }
        }
        return 0;                               // 搜索整个表没有找到，则返回0
    }

    void SLAll(SLType SL) {                     // 显示顺序表中的所有结点
        for(int i = 1; i <= SL.ListLen;i++) {
            System.out.printf("%s%n",SL.ListData[i]);
        }
    }

}

public class SequentialList {
    private static int searchNum;
    private static DATA pdata;

    public static void searchNum(Scanner sc,SLType SL){
        System.out.println("请输入要查找的结点序号：");
        searchNum = sc.nextInt();
        pdata = SL.SLFindByNum(SL,searchNum);
        if(pdata!=null){
            System.out.printf("第%d个结点为：%s",searchNum,pdata);
        }
    }

    public static void searchKey(Scanner sc,SLType SL) {
        System.out.println("请输入要查找的结点关键字：");
        String key = sc.next();
        searchNum = SL.SLFindByCont(SL,key);
        pdata = SL.SLFindByNum(SL,searchNum);
        if(pdata!=null) {
            System.out.printf("第%d个结点为：%s",searchNum,pdata);
        }
    }

    public static void deleteNode(Scanner sc,SLType SL){
        System.out.println("请输入要删除的结点序号：");
        searchNum = sc.nextInt();
        SL.SLDelete(SL,searchNum);
        System.out.println("现在顺序表的结点顺序为：");
        SL.SLAll(SL);
    }

    public static void insertNode(Scanner sc,SLType SL){
        System.out.println("请输入要插入的结点位置");
        searchNum = sc.nextInt();
        System.out.println("请输入要插入的结点数据（学号 姓名 年龄）：");
        pdata.key = sc.next();
        pdata.name = sc.next();
        pdata.age = sc.nextInt();
        SL.SLInsert(SL,searchNum,pdata);
        System.out.println("现在顺序表的结点顺序为：");
        SL.SLAll(SL);
    }

    public static void main(String[] args) {
        System.out.println("***顺序表操作***");
        SLType SL = new SLType();
        SL.SLInit(SL);
        System.out.println("初始化顺序表完成！");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入添加的结点数据（学号 姓名 年龄）：");
            DATA data = new DATA();
            data.key = sc.next();
            data.name = sc.next();
            data.age = sc.nextInt();

            if(data.age!=0){
                if(SL.SLAdd(SL,data)==0){
                    break;
                }
            }else {
                break;
            }
        }while (true);
        System.out.printf("顺序表的长度为：%d%n",SL.SLLength(SL));
        System.out.println("顺序表中的结点顺序为：");
        SL.SLAll(SL);

        boolean flag = true;
        while(flag){
            System.out.println("请输入您接下来要进行的操作号码：");
            System.out.println("1、按序号查找结点");
            System.out.println("2、按关键字查找结点");
            System.out.println("3、删除某个结点");
            System.out.println("4、插入某个结点");
            System.out.println("5、退出");
            int choice = sc.nextInt();
            switch (choice){
                case 1:searchNum(sc,SL);break;
                case 2:searchKey(sc,SL);break;
                case 3:deleteNode(sc,SL);break;
                case 4:insertNode(sc,SL);break;
                case 5:flag=false;break;
            }
        }

    }
}
