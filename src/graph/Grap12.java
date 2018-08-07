package graph;

public class Grap12 {
	public static void main(String[] args) {
		//ÊµĞÄÁâĞÎ
		int left=40,right=40,ldlt=-2,rdlt=2,maxy=9;
		for (int y = 0; y < maxy; y++) {
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
