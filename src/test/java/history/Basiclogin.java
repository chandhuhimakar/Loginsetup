package history;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Basiclogin {
	
	WebDriver driver;
	
	@Given("TEstme is up and running")
	public void testme_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Then("Registered user enter the valid credentials")
	public void registered_user_enter_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
		
	}

	@Then("verfiy for the login ststus for his cred")
	public void verfiy_for_the_login_ststus_for_his_cred() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		String a=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		  System.out.println(a);
		  String b="SignOut";
		  Assert.assertEquals(a,b);
	}

}
