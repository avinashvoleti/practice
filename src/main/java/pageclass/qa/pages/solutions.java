package pageclass.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseclass.qa.pages.Testbase;


public class solutions extends Testbase {

@FindBy(xpath = ("//div[@class='gradient-box-1-2019']/p"))
WebElement hallmark;

}
