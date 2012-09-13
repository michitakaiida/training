package sample;

public class PayMoney {

	public int calcMoney(int month, int temperature, boolean childFlag) {
		int charge;
		int baseCharge;
		int sumMoney;
		int errorFlag = 0;

		// 月に１～１２以外が渡されてるとエラー
		if (month < 1 || month > 12) {
			errorFlag = 1;
		}

		// 気温の処理
		if (temperature < -10 || temperature > 50) {
			errorFlag = 2;
		}

		// 6月～9月の間で25度より気温が高いと夏料金
		// 大人の場合、baseChargeが750円、夏の場合、-250円。子供の場合、baseChargeが10円。
		if (childFlag == false) {
			baseCharge = 750;
			if (5 < month && month < 10 && 25 < temperature) {
				charge = -250;
				sumMoney = (baseCharge + charge) * 10;
			} else {
				charge = 750;
				sumMoney = (baseCharge + charge) * 10;
			}
		} else {
			baseCharge = 10;
			charge = 0;
			sumMoney = (baseCharge + charge) * 10;
		}
		errorFlag = 0;
		return sumMoney;
	}
}
