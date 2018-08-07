package graph;

public class Grap8 {
	public static void main(String[] args) {
		//æ”÷–Ã›–Œ
		int left=40,right=40,ldlt=-2,rdlt=4;
		for (int y = 0; y < 9; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<=right; x++) {
				if (x==left){ch='*';}
				s += ch;
			}
			System.out.println(s);
			left+=ldlt;right+=rdlt;
		}
	}
}