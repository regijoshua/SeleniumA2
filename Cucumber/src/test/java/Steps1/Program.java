package Steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Program {
	public WebDriver driver;

	
	@Given("user should navigate to demowebshop application")
	public void userShouldNavigateToDemowebshopApplication() {
		    driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("user should click on login link")
	public void userShouldClickOnLoginLink() {
		   driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			 
	}

	@Given("user should enter the username as suriya{int}@gmail.com")
	public void userShouldEnterTheUsernameAsSuriyaGmailCom(Integer int1) {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("muhilbharathi1997@gmail.com");

	}

	@Given("user should enter the password as {int}")
	public void userShouldEnterThePasswordAs(Integer int1) {
		   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("MuhilM");

	}

	@When("user click on login button")
	public void userClickOnLoginButton() {
		WebElement actual = driver.findElement(By.xpath("//a[@class='account']"));
		Assert.assertEquals(actual, "muhilbharathi1997@gmail.com");

	}
	
	@When("login should happen")
	public void loginShouldHappen() {
		WebElement actual = driver.findElement(By.xpath("//a[@class='account']"));
		Assert.assertEquals(actual, "muhilbharathi1997@gmail.com");
	}
}
