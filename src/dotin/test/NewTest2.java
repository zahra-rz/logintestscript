package dotin.test;
 

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	
	WebDriver driver;
	
@Test
  public void f() throws InterruptedException {
	
	//LaunchTheWebsite
	  System.setProperty("webdriver.chrome.driver", "./src/dotin/recources/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.digikala.com/");
		Thread.sleep(5000);
		
	//GoToLoginPage
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/div/a")).click();
		Thread.sleep(5000);
   
	//EnterUserName
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/label/div/input")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
		Thread.sleep(5000);
		
    //EnterPassword
		driver.findElement(By.xpath("//*[@id=\"authForm\"]/div[2]/div[3]/label/div/input")).sendKeys("password");
      driver.findElement(By.xpath("//*[@id=\"authForm\"]/button")).click();
		Thread.sleep(5000);
		
    //OpenDropDown
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/div/a")).click();

    //isDiplayed
	     boolean Name = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/p")).isDisplayed();
	     System.out.println(Name);
  }
 

@BeforeMethod
  public void beforeMethod() {
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
