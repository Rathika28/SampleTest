package org.mav;
import java.io.IOException;

import org.mav.AdactinLoginPage;
import org.mav.BaseClass;
import org.testng.annotations.Test;

public class TestngLearn2 extends BaseClass {
	
	@Test
	private void loginpage() throws IOException {
		
		launchurl("https://adactinhotelapp.com/");
		AdactinLoginPage a=new AdactinLoginPage();
		enterText(a.getUsername(), excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 0));
		enterText(a.getPassword(),excelRead("D:\\\\GREENS2\\\\TRAINNING\\\\Practice2.xlsx", "abcd", 0, 1));
		btnclick(a.getLogin());
		
		
		
	}

}
