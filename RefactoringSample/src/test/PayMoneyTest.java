package test;

import org.junit.Assert;
import org.junit.Test;

import sample.PayMoney;

public class PayMoneyTest {

	@Test
	public void �ăZ�[�������̃e�X�g6��26�x() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(5000, calc.calcMoney(6, 26, false));
	}

	@Test
	public void �ăZ�[�������̃e�X�g9��26�x() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(5000, calc.calcMoney(9, 26, false));
	}

	@Test
	public void �ʏ헿���̃e�X�g5��26�x() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(15000, calc.calcMoney(5, 26, false));
	}

	@Test
	public void �q�������e�X�g() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(100, calc.calcMoney(5, 26, true));
	}

}
