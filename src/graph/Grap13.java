package graph;

public class Grap13 {
	public static void main(String[] args) {
		//Ö±½ÇÈý½ÇÐÎ
		int left=40,right=40,ldlt=-2,rdlt=2,maxy=9;
		for (int y = 0; y < maxy; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<=right; x++) {
				if (x==left||x==right){ch='*';}else{ch=' ';}
				s += ch;
			}
			System.out.println(s);
			if(y==maxy/2){
				ldlt*=-1;rdlt*=-1;
			}
			left+=ldlt;right+=rdlt;
		}
	}
}
