package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import com.CardUtil;
import com.ToolUtils;

public class Test33_Card {

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
	
	@Tag("one")
	@Test
	public void testTag1() {
		
	}
	
	@Tag("two")
	@Test
	@DisplayName("returns")
	public void testTag2() {
		
	}
	
	@Tag("three")
	@Test
	public void testTag3() {
		
	}
}
