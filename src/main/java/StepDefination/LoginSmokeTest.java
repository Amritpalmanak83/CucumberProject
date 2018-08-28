package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import helper.CommonFunction;


public class LoginSmokeTest 
{
	public static WebDriver driver;
	
	@Given("^Open the ChromeBrowser and start Platform$")
	public static void open_the_ChromeBrowser_and_start_Platform() throws Throwable 
	{
		String driverPath ="C:\\Users\\Amrit\\Documents\\Java Learning\\learningCucumber\\DriverPath\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/platform90.me/login");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public static void i_enter_Username_and_Password(String Username, String Password) throws Throwable 
	{
		WebElement email= driver.findElement(By.xpath("//input[@id='dnn_ctr_Login_Login_DNN_txtUsername']"));
		email.sendKeys(Username);
		WebElement pass = driver.findElement(By.xpath("//input[@id='dnn_ctr_Login_Login_DNN_txtPassword']"));
		pass.sendKeys(Password); 
	}

	@And("^click Login button$")
	public static void click_Login_button() throws Throwable 
	{
		WebElement LoginButton = driver.findElement(By.xpath("//a[@id='dnn_ctr_Login_Login_DNN_cmdLogin']"));
		LoginButton.click();
	}

	@Then("^Check User able to loginName to Platform or not \"([^\"]*)\"$")
	public static void check_User_able_to_loginName_to_Platform_or_not(String Name) throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Name_User = driver.findElement(By.xpath("//a[@id='dnn_dnnUser_enhancedRegisterLink']"));
		WebElement userName =wait.until(ExpectedConditions.visibilityOf(Name_User));
		String nameOfUser = userName.getText();
		System.out.println(nameOfUser);
		boolean status = new String(nameOfUser).equals(Name);
			if (status)
			{
				System.out.println("User Name is display correctly");
			}
			else
			{
				System.out.println("User Name is not display correctly");
			}
	driver.quit();
	}
	
	@Then("^Check error message and capture screenshot \"([^\"]*)\"$")
	public static void check_error_message_and_capture_screenshot(String tag) throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver , 30);
		TakesScreenshot camera = (TakesScreenshot) driver;
		WebElement elememt = driver.findElement(By.xpath("//div[@class=\"dnnFormMessage dnnFormValidationSummary\"]"));
		WebElement error = wait.until(ExpectedConditions.visibilityOf(elememt));
		if (error.isDisplayed())
		{
			System.out.println(error.getText());
			CommonFunction.takeScreenshot(tag+"LoginError.png", camera);
		}
		else
		{
			System.out.println(error.getText());
			CommonFunction.takeScreenshot(tag+"LoginSuccessful.png", camera);
		}
		
		//driver.quit();	
	}
	
}
