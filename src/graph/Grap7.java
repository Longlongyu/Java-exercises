package graph;

public class Grap7 {
	public static void main(String[] args) {
		//等腰三角形居中
		int left=40,right=40;
		for (int y = 0; y < 9; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<=right; x++) {
				if (x==left){ch='*';}
				s += ch;
			}
			System.out.println(s);
			left--;right++;
		}
	}
}