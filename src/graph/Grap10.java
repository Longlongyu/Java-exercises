package graph;

public class Grap10 {
	public static void main(String[] args) {
		//平行四边形
		int left=40,right=55,ldlt=4,rdlt=4;
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
