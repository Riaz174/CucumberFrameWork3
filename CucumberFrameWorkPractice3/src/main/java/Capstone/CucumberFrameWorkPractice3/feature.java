package Capstone.CucumberFrameWorkPractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feature {
	public WebDriver driver;
	@FindBy(linkText = "Contact") WebElement ContactUsClick;
	@FindBy(xpath = "//*[text()='Join us !']") WebElement JoinUsText;
	@FindBy(id = "form-field-name") WebElement FirstNameField;
	@FindBy(id = "form-field-field_6c5f814") WebElement LastNameField;
	@FindBy(id = "form-field-email") WebElement EmailField;
	@FindBy(id = "form-field-field_694d8a5") WebElement PhoneField;
	@FindBy(xpath = "//*[text()='REGISTER']") WebElement Registerbutton;
	@FindBy(xpath = "//*[text()='The form was sent successfully.']") WebElement Confirmation;
	public feature(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ContactUs() {
		ContactUsClick.click();
	}
	public WebElement JoinUsText() {
		return JoinUsText;
		
		
	}
	public void FirstNameSendkeys(String name) {
		FirstNameField.sendKeys(name);
	}
	public void LastNameSendkeys(String name) {
		LastNameField.sendKeys(name);
	}
	public void EmailField(String email) {
		EmailField.sendKeys(email);
	}
	public void PhoneField(String phone) {
		PhoneField.sendKeys(phone);
	}
	public void Registerbutton() {
		Registerbutton.click();
	}
	public WebElement Confirm() {
		return Confirmation;
	}
}
