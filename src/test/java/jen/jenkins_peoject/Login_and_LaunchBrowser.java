package jen.jenkins_peoject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_and_LaunchBrowser {
  @Test
  public void login() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.manage().window().maximize();
	  driver.get("https://demo.testfire.net/login.jsp");
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  WebElement pwd = driver.findElement(By.id("passw"));
	  js.executeScript("arguments[0].value='demo1234'", pwd);
	  driver.findElement(By.name("btnSubmit")).click();
  }
}
