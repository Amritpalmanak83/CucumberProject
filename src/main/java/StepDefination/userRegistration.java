package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userRegistration 
{
	public static WebDriver driver;
	
	@Given("^Open the ChromeBrowser and enter registration link$")
	public static  void open_the_ChromeBrowser_and_enter_registration_link() throws Throwable {
		String setpath = "C:\\Users\\Amrit\\Documents\\Java Learning\\learningCucumber\\DriverPath\\";
		System.setProperty("webdriver.chrome.driver", setpath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/platform90.me/register");
	}

	@When("^User enter UserName, Password ,ConfirmPassword, DisplayName and EmailAddress$")
	public static void user_enter_UserName_Password_ConfirmPassword_DisplayName_and_EmailAddress() throws Throwable 
	{
		WebElement userName = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[1]/input"));
		userName.sendKeys("NewUser11201");
		WebElement password = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div/div[2]/input"));
		password.sendKeys("dnnhost11201");
		WebElement conPass = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[3]/input"));
		conPass.sendKeys("dnnhost11201");
		WebElement displayName = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[4]/input"));
		displayName.sendKeys("newuser11201");		
		WebElement email = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[5]/input"));
		email.sendKeys("newuser11201@dnn.com");				
		
	}

	@And("^Click Register button$")
	public static void click_Register_button() throws Throwable 
	{
		WebElement registerButton = driver.findElement(By.id("dnn_ctr_Register_registerButton"));
		registerButton.click();
	}

	@Then("^User Registration message should display$")
	public static void user_Registration_message_should_display() throws Throwable 
	{
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String successmsg = "An email with your details has been sent to the Site Administrator for verification. You will be notified by email when your registration has been approved. In the meantime you can continue to browse this site by closing the popup.";
		WebDriverWait wait = new WebDriverWait ( driver, 30);
		WebElement displaymessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='dnn_ctr_Register_UP']/div/span/strong")));
		String confirmmsg = displaymessage.getText();
		System.out.println(confirmmsg);
		boolean status = new String(successmsg).equals(confirmmsg);
		if(status)
		{
			System.out.println("register successful");
		}
		else
		{
			System.out.println("register not successful");
		}
		WebElement closebutton = driver.findElement(By.xpath("//a[@id='dnn_ctr_Register_cancelLink']"));
		closebutton.click();
		driver.quit();
	}
	
	@When("^User enter \"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public static void user_enter_and(String username, String pass, String confpass, String displayname, String email) throws Throwable 
	{
		WebElement userName = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[1]/input"));
		userName.sendKeys(username);
		WebElement password = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div/div[2]/input"));
		password.sendKeys(pass);
		WebElement conPass = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[3]/input"));
		conPass.sendKeys(confpass);
		WebElement displayName = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[4]/input"));
		displayName.sendKeys(displayname);		
		WebElement Email = driver.findElement(By.xpath("//div[@id='dnn_ctr_Register_userForm']/div[5]/input"));
		Email.sendKeys(email);	
	}
	
	@Then("^User Registration failed and show error message on page$")
	public void user_Registration_failed_and_show_error_message_on_page() throws Throwable {
		String errormsg = "A user already exists for the user name specified. Please register again using a different user name.";
		WebDriverWait wait = new WebDriverWait ( driver, 30);
		WebElement displaymessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='dnn_ctr_Register_UP']/div/span")));
		String confirmmsg = displaymessage.getText();
		System.out.println(confirmmsg);
		boolean status = new String(errormsg).equals(confirmmsg);
		if(status)
		{
			System.out.println("register Failed");
		}
		else
		{
			System.out.println("register did not failed");
		}
		WebElement closebutton = driver.findElement(By.xpath("//a[@id='dnn_ctr_Register_cancelLink']"));
		closebutton.click();
		driver.quit();
	}
}

