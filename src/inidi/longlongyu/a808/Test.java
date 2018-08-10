package inidi.longlongyu.a808;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		boolean isRuinian = false;
		int y = Integer.parseInt(JOptionPane.showInputDialog("��������:"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("��������:"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("��������:"));
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			isRuinian = true;
		}
		if (y < 1 || m > 12 || m < 1 || d < 1 || d > findDate(m, isRuinian)) {
			JOptionPane.showMessageDialog(null, "�������,�����˳�");
			System.exit(0);
			return;
		}
		int n = d;
		for (int i = 1; i < m; i++) {
			n += findDate(i, isRuinian);
		}
		JOptionPane.showMessageDialog(null, y + "��" + m + "��" +  d  + "��" 
				+ " ��һ���еĵ� " + n + " ��");
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
