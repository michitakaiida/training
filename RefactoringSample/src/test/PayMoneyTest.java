package test;

import org.junit.Assert;
import org.junit.Test;

import sample.PayMoney;

public class PayMoneyTest {

	@Test
	public void 夏セール料金のテスト6月26度() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(5000, calc.calcMoney(6, 26, false));
	}

	@Test
	public void 夏セール料金のテスト9月26度() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(5000, calc.calcMoney(9, 26, false));
	}

	@Test
	public void 通常料金のテスト5月26度() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(15000, calc.calcMoney(5, 26, false));
	}

	@Test
	public void 子供料金テスト() {
		PayMoney calc = new PayMoney();
		Assert.assertEquals(100, calc.calcMoney(5, 26, true));
	}

}
