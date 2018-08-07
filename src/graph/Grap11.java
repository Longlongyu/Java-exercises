package graph;

public class Grap11 {
	public static void main(String[] args) {
		//裁剪
		int left=40,right=40,ldlt=0,rdlt=1,maxy=9;
		for (int y = 0; y < maxy; y++) {
			String s = "";char ch=' ';
			for (int x = 0; x<=right; x++) {
				if (x==left){ch='*';}
				s += ch;
			}
			System.out.println(s);
			if(y==maxy/2){
				rdlt*=-1;
			}
			left+=ldlt;right+=rdlt;
		}
	}
}
//下面的三角形头朝上
//         * 8,0
//        ** 7,1
//       *** 6,2
//      **** 5,3
//     *****
//    ******
//   *******
//  ********
// *********
//**********