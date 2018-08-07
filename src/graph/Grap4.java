package graph;

public class Grap4 {
	public static void main(String[] args) {
		//Ö±½ÇÈý½ÇÐÎ
		for (int y = 0; y < 9; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<9; x++) {
				if (x==y){ch='*';}
				s += ch;
			}
			System.out.println(s);
		}
	}
}