package new12;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;
@TestMethodOrder(OrderAnnotation.class) // << this annotation is for using @order, or adding order to my test-cases
public class Project1 {
	// define all your variables that you need to initialise through different tests
	private static ChromeDriver driver;
	private String expectedResult;
	private String actualResult;
	private WebElement element;
	private WebDriverWait wait;
	

	@BeforeAll
	// setup my driver here through @BeforeAll, this method is running once before
	// all test-cases
	public static void setup() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	@Order(1) // << the order of the test, so this test-case is running as first
	
	// Test if the browser is openning the Google.com page
	public void testwebsite() {
driver.get("https://jupiter.cloud.planittesting.com/#/");
		}

	@Test
	@Order(2) // Going to shop page
	public void s2() {
		By css = By.cssSelector("a[href='#/shop']");
		WebElement element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		
	}
	@Test
	@Order(3) // choose item 1
	public void s3() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By css1 = By.cssSelector("#product-3 > div > p > .btn");
		WebElement element1 = driver.findElement(css1);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element1);
	}
	@Test
	@Order(4) // choose item 2
	
	public void s4() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By css2 = By.cssSelector("#product-6 > div > p > .btn");
		WebElement element2 = driver.findElement(css2);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element2);
	}
	@Test
	@Order(5) // going to cart
	public void s5() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By css3 = By.cssSelector("#nav-cart > a");
		WebElement element3 = driver.findElement(css3);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element3);
		
	}
	@Test
	@Order(6) 
	//New order to update
	public void s6() {
		WebElement qt=driver.findElement(By.name("quantity"));
		qt.sendKeys("5");// Making the order as 15 by concat
		}
	@Test
	@Order(7) //Going to checkout
	public void s7() {
	
		By css10 = By.cssSelector("a[href='#/checkout']");
		WebElement element10 = driver.findElement(css10);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element10);
		
	}
	@Test
	@Order(8) 
	//going to shop cart
	public void s8() {
		By css = By.cssSelector("a[href='#/shop']");
		WebElement element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		
	}
	@Test
	@Order(9) 
	//Confirmming order
	public void s9() {
		WebElement forename=driver.findElement(By.id("forename"));
		forename.sendKeys("King");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("aus@gmail.com");
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("2 25 Apt name, Bentleigh Vic");
		WebElement card=driver.findElement(By.id("card"));
		card.sendKeys("1234567891234567");
		Select ct=new Select(driver.findElementByName("cardType"));
		ct.selectByVisibleText("Visa");
		driver.findElementById("checkout-submit-btn").click();
	}
	@Test
	@Order(10) // Going back to shop cart
	public void orderhistory1() {
		By css = By.cssSelector("a[href='#/shop']");
		WebElement element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		
	}
	
	@AfterAll
	// closing or quitting the browser after the test
	public static void closeBrowser() {
		driver.close();
		// driver.quit();
	}
}
