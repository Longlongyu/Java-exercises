package indi.longlongyu.javaexericises;

public class B807 {
	public static void main(String[] args) {
		int[] randomArray = createRandomIntArray(5);
		int min = getIntArrayMinNumber(randomArray);
		
		printIntArrayNumber(randomArray);
		System.out.println("该数组最小的值为: " + min);
		
		randomArray = setArrayReversal(randomArray);
		System.out.println("现在反转了数组.");
		printIntArrayNumber(randomArray);
	}
	
	public static int[] createRandomIntArray(int len) {
		int[] a = new int[len];
		for (int i = 0; i < len; i++)
			a[i] = (int) (Math.random() * 100);
		return a;
	}
	
	public static void printIntArrayNumber(int[] a) {
		System.out.print("该数组的值为: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("   " + a[i]);
		}
		System.out.println();
	}
	
	public static int getIntArrayMinNumber(int[] a) {
		int n = a[0];
		for (int i = 1; i < a.length; i++) {
			if (n > a[i]) {
				n = a[i];
			}
		}
		return n;
	}
	
	public static int[] setArrayReversal(int[] a) {
		int[] x = new int[a.length];
		int pos = a.length - 1;
		int n = a[0];
		for (int i = 0; i < a.length; i++) {
			x[pos] = a[i];
			pos--;
		}
		return x;
	}
}
