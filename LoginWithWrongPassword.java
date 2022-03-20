import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount
{
		public static void main(String[] args) 
		{
1			WebElement signInButton = driver.findElement(By.xpath(“//*[@class="nav-link" and text()="Sign in"]”));
			WebElement email = driver.findElement(By.xpath(“//*[@class="form-control form-control-lg" and @placeholder='Email']”));
			WebElement password = driver.findElement(By.xpath(“//*[@class="form-control form-control-lg" and @placeholder='Email']”));
			WebElement signIn = driver.findElement(By.xpath(“//*[@class="btn btn-lg btn-primary pull-xs-right" and text()="Sign in"]”));
			WebElement error = driver.findElement(By.xpath(“//*[contains(text(), 'email or password')]”));
				
			string url = "https://react-redux.realworld.io/";
			string username = "TEST";
			string email = "auto@dummy.com"
			string password = "Password";

			//Setting the driver executable
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

			//Initiating your chromedriver
			WebDriver driver=new ChromeDriver();

			//Applied wait time
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//Maximize window
			driver.manage().window().maximize();

			//Open browser with desried URL
			driver.get(url);

			//Click SignUp
			signInButton.click();

			//Input required information
			email.sendKeys(email);
			password.sendKeys(password);
			signIn.click();

			//Verify user info appear in HomePage
			Assert.assertEquals(true, error.isDisplayed());

			//Closing the browser
			driver.close();
		}
}
