package graph;

public class Grap9 {
	public static void main(String[] args) {
		//裁剪
		int left=40,right=55,ldlt=-2,rdlt=4;
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