package indi.longlongyu.javaexericises;

public class A807 {
	public static void main(String[] args) {
		int A = 2;
		int B = 5;
		int money = 5;
		int count = 0;
		for (int i = 0; i <= money/B; i++) {
			int n = money - (i * B);
			for (int j = 0; j <= n/A; j++) {
				int x = n - (j * A);
				if (x < 0) continue;
				System.out.println("5元钱: "+ i + "    2元钱: " + j + "    1元钱: " + x);
				count++;
			}
		}
		System.out.println("共有 " + count + " 个组合.");
	}
}
