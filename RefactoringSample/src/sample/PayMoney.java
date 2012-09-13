package sample;

public class PayMoney {

	public int calcMoney(int month, int temperature, boolean childFlag) {
		int charge;
		int baseCharge;
		int sumMoney;
		int errorFlag = 0;

		// ���ɂP�`�P�Q�ȊO���n����Ă�ƃG���[
		if (month < 1 || month > 12) {
			errorFlag = 1;
		}

		// �C���̏���
		if (temperature < -10 || temperature > 50) {
			errorFlag = 2;
		}

		// 6���`9���̊Ԃ�25�x���C���������Ɖė���
		// ��l�̏ꍇ�AbaseCharge��750�~�A�Ă̏ꍇ�A-250�~�B�q���̏ꍇ�AbaseCharge��10�~�B
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
