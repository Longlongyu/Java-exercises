package graph;

public class Grap3 {
	public static void main(String[] args) {
		//��ֱ��������
		for (int y = 0; y < 9; y++) {
			String s = "";
			for (int x = 0; x+y<9; x++) {
				s += '*';
			}
			System.out.println(s);
		}
	}
}
