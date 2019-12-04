package test.qa.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.qa.pages.Testbase;
import pageclass.qa.pages.About;
import pageclass.qa.pages.Homepage;
import util.qa.pages.TestUtil;

public class Homepagetest extends Testbase {

	Homepage hg;
	About aboutpage;
    TestUtil tu;
	
	public Homepagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		tu = new TestUtil();
	 hg = new Homepage();
	}
	
	@Test(priority=1)
	public void verifyhomepagetitle() {
	String title =	hg.validateaboutpagetitle();
	Assert.assertEquals(title, "Data Governance | Enterprise Modeling & Data Intelligence");
	}
	
	@Test(priority=2)
	public void erwinlogo() {
		boolean flag =hg.verifyerwinlogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void about() {
		aboutpage = hg.Clickit();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}
