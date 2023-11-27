package StepDefinitionC;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Capstone.CucumberFrameWorkPractice3.feature;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsFormC {
	public WebDriver driver;
	feature ob = new feature(driver);
	@Before
	public void setup() {
		 String Path = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\CucumberPractice3\\src\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.protrainingtech.com");
		 driver.manage().window().maximize();
	}
	@Given("^Already opened the protrainingtech\\.com$")
	public void already_opened_the_protrainingtech_com() throws Throwable {
	 String id = driver.getCurrentUrl();
	 System.out.println(id);
	 Assert.assertEquals(id, "https://protrainingtech.com/");
	  
	   }

	@When("^user clicks on the contact us link$")
	public void user_clicks_on_the_contact_us_link() throws Throwable {
	  feature ob = new feature(driver);
		Thread.sleep(6000);
	   ob.ContactUs();
	}

	@Then("^user able to see contact us form$")
	public void user_able_to_see_contact_us_form() throws Throwable {
		Thread.sleep(6000);
		feature ob = new feature(driver);
	 WebElement Course = ob.JoinUsText(); 
	 String CourseElementText = Course.getText();
	 System.out.println(CourseElementText);
	 
	}

	@When("^user enters value for First Name \"([^\"]*)\"$")
	public void user_enters_value_for_First_Name(String arg1) throws Throwable {
		Thread.sleep(6000);
		feature ob = new feature(driver);
		ob.FirstNameSendkeys(arg1);
	    }

	@And("^user enters value for Last Name \"([^\"]*)\"$")
	public void user_enters_value_for_Last_Name(String arg1) throws Throwable {
		feature ob = new feature(driver);
		ob.LastNameSendkeys(arg1);
	    	}

	@And("^user enters value for Email \"([^\"]*)\"$")
	public void user_enters_value_for_Email(String arg1) throws Throwable {
		feature ob = new feature(driver);
		ob.EmailField(arg1);
	    	}

	@And("^user enters value for Phone \"([^\"]*)\"$")
	public void user_enters_value_for_Phone(String arg1) throws Throwable {
		feature ob = new feature(driver);
			ob.PhoneField(arg1);
	    }

	@When("^user clicks register button$")
	public void user_clicks_register_button() throws Throwable {
		feature ob = new feature(driver);
			ob.Registerbutton();
	    }

	@Then("^user should see confirmation message$")
	public void user_should_see_confirmation_message() throws Throwable {
		feature ob = new feature(driver);
		Thread.sleep(6000);
		WebElement Confirmation = ob.Confirm();
	    String dx = ob.Confirm().getText();
	    System.out.println(dx);
	    //Assert.assertEquals(dx, "The form was sent successfully.");
		
	    	}
}
