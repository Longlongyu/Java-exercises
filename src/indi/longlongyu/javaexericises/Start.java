package indi.longlongyu.javaexericises;

import java.util.Scanner;

/**
 * @author Longlongyu
 *
 */
public class Start {
	public static void main(String[] args) {
		/*
		 * 1.输出如下的图形
		 *
		 * * ** *** ** *
		 */
		int max = 5;
		for (int i = 1, j = 0; i < max + 1; i++) {
			String str = "";
			if (i <= max / 2 + 1) {
				j++;
			} else {
				j--;
			}
			for (int n = 0; j > n; n++) {
				str += "*";
			}
			System.out.println(str);
		}

		/*
		 * 2 .判断某一年是否为闰年 通过Scanner 输入一个年份，然后判断概念是否是闰年 闰年判断标准(满足任何一个) 1.
		 * 如果能够被4整除，但是不能被100整除 2. 能够被400整除
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("你可以输入 exit 退出 ");
		System.out.println("请输入一个年份>>> ");
		while (true) {
			if (s.hasNextInt()) {
				int num = s.nextInt();
				if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
					System.out.println(num + " 年是闰年!");
				} else {
					System.out.println(num + " 年不是闰年!");
				}
			} else {
				String line = s.nextLine();
				if (line.indexOf("exit") != -1) {
					System.out.println("您已退出! ");
					break;
				}
				System.out.println("Error!请输入一个年份!");
			}
			System.out.println("请输入一个年份>>> ");
		}

		/*
		 * 3 .通过Scanner 输入月份，然后使用switch 判断季节
		 */
		Scanner s1 = new Scanner(System.in);
		System.out.println("你可以输入 exit 退出 ");
		System.out.println("请输入一个月份>>> ");
		while(true) {
		  if (s1.hasNextInt()) {
		    int m = s1.nextInt();
		    switch (m) {
		      case 3:
		      case 4:
		      case 5: 
		        System.out.println(m + " 月份是春季!");
		        break;
		      case 6:
		      case 7:
		      case 8:
		        System.out.println(m + " 月份是夏季!");
		        break;
		      case 9:  
		      case 10:
		      case 11:
		        System.out.println(m + " 月份是秋季!");
		        break;
		      case 12:
		      case 1:  
		      case 2:
		        System.out.println(m + " 月份是冬季!");
		        break;
		      default:
		        System.out.println("Error!请输入一个月份! ");
		    }
		  } else {
		    if (s1.nextLine().indexOf("exit")!=-1) {
		      System.out.println("您已退出! ");
		      break;
		    }
		    System.out.println("Error!请输入一个月份! ");
		  }
		  System.out.println("请输入一个月份>>> ");
		}

		/*
		 * 4.通过Scanner 获取一个整数，然后计算这个整数的阶乘
		 */
		Scanner s2 = new Scanner(System.in);
		System.out.println("你可以输入 exit 退出 ");
		System.out.println("请输入一个整数>>> ");
		while (true) {
			if (s2.hasNextInt()) {
				int num = s2.nextInt();
				long n = num;
				long j = n;
				for (int i = 1; i < num; i++) {
					n = n * (j - i);
				}
				System.out.println(num + " 的乘阶是: " + n);
			} else {
				String line = s2.nextLine();
				if (line.indexOf("exit") != -1) {
					System.out.println("您已退出! ");
					break;
				}
				System.out.println("Error!请输入一个整数!");
			}
			System.out.println("请输入一个整数>>> ");
		}

		/*
		 * 5.天朝有一个乞丐姓洪，去天桥要钱 第一天要了1块钱 第二天要了2块钱 第三天要了4块钱 第四天要了8块钱 以此类推
		 */

		int money = 0;
		int day = 10;
		for (int i = 0, j = 1; i < day; i++) {
			money = money + j;
			j = j * 2;
		}
		System.out.println("乞丐现在一共有 " + money + "块钱。");

		/*
		 * 6.打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
		 * 
		 */
		int maxNum = 100;
		int minNum = 1;
		String str = "";
		for (int i = minNum; i <= maxNum; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				str = str + " " + i;
			}
		}
		System.out.println(str);
	}
}