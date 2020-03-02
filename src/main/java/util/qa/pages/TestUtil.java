package util.qa.pages;

import baseclass.qa.pages.Testbase;

public class TestUtil extends Testbase {
 public static long PAGE_LOAD_TIMEOUT = 40000;
 public static long IMPLICIT_WAIT = 3000;
	public static long test = 2000;


public void switchtoframe() {
	driver.switchTo().frame("");
}


}
