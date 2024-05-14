package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// declare
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTF;

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
}
