package graph;

public class Grap5 {
	public static void main(String[] args) {
		//µÈÑüÈı½ÇĞÎ
		for (int y = 0; y < 9; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<9; x++) {
				if (x+y==8){ch='*';}
				s += ch;
			}
			System.out.println(s);
		}
	}
}
