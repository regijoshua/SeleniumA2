package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Driver.Driver_Instance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class setups extends Driver_Instance{
//	public WebDriver driver;
	@Given("user should navigate to Demo WebShop Application")
	public void userShouldNavigateToDemoWebShopApplication() {
//	    driver= new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("user should click on loginlink")
	public void userShouldClickOnLoginlink() {
	   driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    
	}

	@Given("user should enter username as muhilbharathi{int}@gmail.com")
	public void userShouldEnterUsernameAsMuhilbharathiGmailCom(Integer int1) {
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("muhilbharathi1997@gmail.com");
	    
	}

	@Given("user should enter password as MuhilM")
	public void userShouldEnterPasswordAsMuhilM() {
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("MuhilM");
    
	}
	
//	@Given("user should enter username as {string}")
//	public void userShouldEnterUsernameAs(String string) {
//        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("muhilbharathi1997@gmail.com");
//	}
//	  
//
//	@Given("user should enter password as {string}")
//	public void userShouldEnterPasswordAs(String string) {
//		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Muhil");
//	    	}



	@When("user click loginButton")
	public void userClickLoginButton() {
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	}

	@When("login should happen")
	public void loginShouldHappen() {
		String actual = driver.findElement(By.xpath("//a[@class='account']")).getText();
		Assert.assertEquals(actual, "muhilbharathi1997@gmail.com");
																						              
		
	}
	
	@Then("login should not happen")
	public void loginShouldNotHappen() {
		String actual = driver.findElement(By.xpath("//a[@class='account']")).getText();
		Assert.assertEquals(actual, "muhilbharathi1997@gmail.com");
	}

	

}
