package inidi.longlongyu.a808;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		boolean isRuinian = false;
		int y = Integer.parseInt(JOptionPane.showInputDialog("请输入年:"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("请输入月:"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("请输入日:"));
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			isRuinian = true;
		}
		if (y < 1 || m > 12 || m < 1 || d < 1 || d > findDate(m, isRuinian)) {
			JOptionPane.showMessageDialog(null, "输入错误,程序退出");
			System.exit(0);
			return;
		}
		int n = d;
		for (int i = 1; i < m; i++) {
			n += findDate(i, isRuinian);
		}
		JOptionPane.showMessageDialog(null, y + "年" + m + "月" +  d  + "日" 
				+ " 是一年中的第 " + n + " 天");
		System.exit(0);
	}	
	static int findDate(int m, boolean isRuinian) {
		int d;
		switch (m) {
			case 2:
				d = 28;
				if (isRuinian) d++;
				break;
			case 4: case 6: case 9: case 11:
				d = 30;
				break;
			default:
				d = 31;
		}
		return d;
	}
}
