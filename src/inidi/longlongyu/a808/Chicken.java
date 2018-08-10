package inidi.longlongyu.a808;

public class Chicken {
	public static void main(String[] args) {
		int cockPrice = 5;
		int biddyPrice = 3;
		int baseMoney = 100;
		int baseCount = 100;
		for (int cockNum = 0; cockNum < baseMoney / cockPrice; cockNum++) {
		  int	startMoney = baseMoney;
			int startCount = baseCount;
			int boughtMoney = startMoney -= cockNum * cockPrice;
			int boughtCount = startCount -= cockNum;
			for (int biddyNum = 0; biddyNum < startMoney / biddyPrice; biddyNum++) {
				boughtMoney = startMoney - (biddyNum * biddyPrice);
				boughtCount = startCount - biddyNum;
				int smallChickenNum = boughtMoney * 3;
				int finalCount = boughtCount - smallChickenNum;
				if(finalCount != 0) continue;
				System.out.println(cockNum + " " + biddyNum + " " + smallChickenNum);
			}
		}
	}
}
