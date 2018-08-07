package indi.longlongyu.javaexericises;

public class B807 {
	public static void main(String[] args) {
		int[] randomArray = createRandomIntArray(5);
		int min = getIntArrayMinNumber(randomArray);
		
		printIntArrayNumber(randomArray);
		System.out.println("该数组最小的值为: " + min);
		
		setArrayReversal(randomArray);
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
	
	public static void setArrayReversal(int[] a) {
		int pos = a.length -1;
		for (int i = 0; i < a.length / 2; i++) {
			swapNumber(a, i, pos);
			pos--;
		}
	}
	
	public static void swapNumber(int[] a,int x,int y){
    int buffer = a[x];
    a[x] = a[y];
    a[y] = buffer;
	}
}
