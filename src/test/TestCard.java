package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.CardUtil;
import com.ToolUtils;

public class TestCard {

	@Test
	public void testIdCard() {
		
		String isIdCard = CardUtil.verifyIDCard("370406199001016835");
		assertEquals("YES", isIdCard);
		
		boolean isId = CardUtil.isIDCard("370406199001016835");
		assertEquals(true, isId);
	}

	@Test
	public void testBankCard() {
		
		String isBankCard = CardUtil.veriftBankCard("6228480240555592");
		assertEquals("YES", isBankCard);
	
	}
	
	@Test
	public void testPhone() {
		
		boolean isPhoneNum = ToolUtils.isMobileNO("18521360114");
		assertEquals(true, isPhoneNum);
	
	}
}
