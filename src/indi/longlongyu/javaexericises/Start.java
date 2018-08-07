package indi.longlongyu.javaexericises;

import java.util.Scanner;

/**
 * @author Longlongyu
 *
 */
public class Start {
	public static void main(String[] args) {
		/*
		 * 1.������µ�ͼ��
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
		 * 2 .�ж�ĳһ���Ƿ�Ϊ���� ͨ��Scanner ����һ����ݣ�Ȼ���жϸ����Ƿ������� �����жϱ�׼(�����κ�һ��) 1.
		 * ����ܹ���4���������ǲ��ܱ�100���� 2. �ܹ���400����
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("��������� exit �˳� ");
		System.out.println("������һ�����>>> ");
		while (true) {
			if (s.hasNextInt()) {
				int num = s.nextInt();
				if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
					System.out.println(num + " ��������!");
				} else {
					System.out.println(num + " �겻������!");
				}
			} else {
				String line = s.nextLine();
				if (line.indexOf("exit") != -1) {
					System.out.println("�����˳�! ");
					break;
				}
				System.out.println("Error!������һ�����!");
			}
			System.out.println("������һ�����>>> ");
		}

		/*
		 * 3 .ͨ��Scanner �����·ݣ�Ȼ��ʹ��switch �жϼ���
		 */
		Scanner s1 = new Scanner(System.in);
		System.out.println("��������� exit �˳� ");
		System.out.println("������һ���·�>>> ");
		while(true) {
		  if (s1.hasNextInt()) {
		    int m = s1.nextInt();
		    switch (m) {
		      case 3:
		      case 4:
		      case 5: 
		        System.out.println(m + " �·��Ǵ���!");
		        break;
		      case 6:
		      case 7:
		      case 8:
		        System.out.println(m + " �·����ļ�!");
		        break;
		      case 9:  
		      case 10:
		      case 11:
		        System.out.println(m + " �·����＾!");
		        break;
		      case 12:
		      case 1:  
		      case 2:
		        System.out.println(m + " �·��Ƕ���!");
		        break;
		      default:
		        System.out.println("Error!������һ���·�! ");
		    }
		  } else {
		    if (s1.nextLine().indexOf("exit")!=-1) {
		      System.out.println("�����˳�! ");
		      break;
		    }
		    System.out.println("Error!������һ���·�! ");
		  }
		  System.out.println("������һ���·�>>> ");
		}

		/*
		 * 4.ͨ��Scanner ��ȡһ��������Ȼ�������������Ľ׳�
		 */
		Scanner s2 = new Scanner(System.in);
		System.out.println("��������� exit �˳� ");
		System.out.println("������һ������>>> ");
		while (true) {
			if (s2.hasNextInt()) {
				int num = s2.nextInt();
				long n = num;
				long j = n;
				for (int i = 1; i < num; i++) {
					n = n * (j - i);
				}
				System.out.println(num + " �ĳ˽���: " + n);
			} else {
				String line = s2.nextLine();
				if (line.indexOf("exit") != -1) {
					System.out.println("�����˳�! ");
					break;
				}
				System.out.println("Error!������һ������!");
			}
			System.out.println("������һ������>>> ");
		}

		/*
		 * 5.�쳯��һ����ؤ�պ飬ȥ����ҪǮ ��һ��Ҫ��1��Ǯ �ڶ���Ҫ��2��Ǯ ������Ҫ��4��Ǯ ������Ҫ��8��Ǯ �Դ�����
		 */

		int money = 0;
		int day = 10;
		for (int i = 0, j = 1; i < day; i++) {
			money = money + j;
			j = j * 2;
		}
		System.out.println("��ؤ����һ���� " + money + "��Ǯ��");

		/*
		 * 6.��ӡ 1-100 ֮�����������������Ҫô��3��Ҫô5�ı������ͺ��Ե�
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