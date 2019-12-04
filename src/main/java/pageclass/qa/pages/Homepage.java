package pageclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.qa.pages.Testbase;

public class Homepage extends Testbase{

	
@FindBy(xpath="//div[@class='menu-primary-container']/ul/li[7]/a")
WebElement About;

@FindBy(xpath="//div[@class='flex-row']/a[@class='logo']/img")
WebElement erwinlogo;
 
public Homepage() {
	PageFactory.initElements(driver, this);
}

public String validateaboutpagetitle() {
	return driver.getTitle();
}
public boolean  verifyerwinlogo() {
	 return erwinlogo.isDisplayed();
	
}

public About Clickit() {
	About.click();
	return new About();	
}
}
