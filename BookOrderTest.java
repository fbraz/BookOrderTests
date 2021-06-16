// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class BookOrderTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  private List<WebElement> stories;
  private WebElement story;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.chrome.driver","C://Users//Janez//Drivers//chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void bookOrder() {
	driver.get("https://hoorayheroes.co.uk/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	WebDriverWait wait=new WebDriverWait(driver, 20);
    driver.manage().window().setSize(new Dimension(1342, 708));
    
    if (driver.findElements(By.cssSelector(".gtm-cookies-accept-all")).size() != 0)
    { 
    	driver.findElement(By.cssSelector(".gtm-cookies-accept-all")).click();	
    }
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".boy:nth-child(1)")));
    driver.findElement(By.cssSelector(".boy:nth-child(1)")).click();
    driver.findElement(By.id("character-name")).sendKeys("Martin");
    driver.findElement(By.cssSelector(".animate")).click();
    
    {
      WebElement element = driver.findElement(By.id("button-magic"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
	}
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".skin02 > .skin02")).click();
    driver.findElement(By.cssSelector(".eyes > span > span")).click();
    driver.findElement(By.cssSelector(".blue")).click();
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button-magic")));
    //driver.findElement(By.id("button-magic")).click();
    driver.findElement(By.cssSelector("div:nth-child(1) > .book-details > .button")).click();
    driver.findElement(By.cssSelector(".gtm-product-arrow-down-first")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gtm-character-1")));
    try {
    driver.findElement(By.cssSelector(".gtm-character-1")).click();
    }catch(Exception e) {
    	System.out.println(e);
    }
    js.executeScript("window.scrollTo(0,2616)");
    try {
    driver.findElement(By.cssSelector(".personalization-slider:nth-child(1) .skin02 > .skin02")).click();
    }catch(Exception e) {
    	System.out.println(e);
    }
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".eyes:nth-child(3) > span > span")));
    try {
    driver.findElement(By.cssSelector(".eyes:nth-child(3) > span > span")).click();
    }catch(Exception e) {
    	System.out.println(e);
    }
    driver.findElement(By.cssSelector(".eyes:nth-child(3) .blue")).click();
    driver.findElement(By.cssSelector(".gtm-character-2")).click();
    js.executeScript("window.scrollTo(0,2980)");
    
   if( driver.findElements(By.id("book-stories")).size()!=0) {
	   int i=0;
	   
	  
	   while(i<=10) {
		   
		   	stories=driver.findElements(By.id("book-stories"));
		    System.out.println( stories.size());
		    stories.get(0).click();
		    stories=driver.findElements(By.cssSelector(".icon-arrow-right-squared:nth-child(3)"));
		    System.out.println( stories.size());
		    stories.get(0).click();
		    i++;
		   
	   }
	   
	   stories=driver.findElements(By.id("book-stories"));
	    
	    System.out.println( stories.size());
	    stories.get(0).click();
	    stories=driver.findElements(By.cssSelector(".icon-arrow-right-squared:nth-child(3)"));
	    System.out.println( stories.size());
	    stories.get(0).click();
	    //book1
	    stories=driver.findElements(By.id("book-stories"));
	    System.out.println( stories.size());
	    stories.get(0).click();
	    
	    
	   
	   	
	   	driver.findElement(By.cssSelector(".visible.after-row.story-thumbnail-images")).click();
	    driver.findElement(By.cssSelector(".li.visible:nth-child(4) .story-number")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(6) .story-number")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(3) .story-number")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(5) .story-number")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(1) .story-number")).click();
	    driver.findElement(By.cssSelector(".icon-arrow-right-squared:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".icon-arrow-right-squared:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(9) .story-number")).click();
	    driver.findElement(By.cssSelector(".icon-arrow-right-squared:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(10) .story-number")).click();
	    driver.findElement(By.cssSelector(".icon-arrow-right-squared:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(11) .story-number")).click();
	    driver.findElement(By.cssSelector(".visible:nth-child(7) .story-number")).click();  
   }
    

   
    driver.findElement(By.cssSelector(".gtm-product-stories-save")).click();
    driver.findElement(By.cssSelector(".soft-cover")).click();
    driver.findElement(By.cssSelector(".gtm-product-cover-save")).click();
    driver.findElement(By.name("dedication")).click();
    driver.findElement(By.name("dedication")).sendKeys("Quality Assurance");
    driver.findElement(By.cssSelector(".gtm-product-dedication-save")).click();
    driver.findElement(By.cssSelector(".gtm-giftbox-33-id:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".gtm-giftbox-33-id:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".gtm-product-submit")).click();
    driver.findElement(By.cssSelector(".character-name")).click();
    driver.findElement(By.cssSelector(".character-name > div:nth-child(2) > input")).sendKeys("Theo");
    driver.findElement(By.cssSelector(".gtm-product-overlay-submit")).click();
    driver.findElement(By.cssSelector(".input-group-checkbox > label")).click();
    driver.findElement(By.cssSelector(".col-12 > span > .button")).click();
    driver.findElement(By.name("cart[customer][firstname]")).click();
    driver.findElement(By.name("cart[customer][firstname]")).sendKeys("Fatima");
    driver.findElement(By.name("cart[customer][lastname]")).sendKeys("Brazao");
    driver.findElement(By.name("cart[customer][address]")).sendKeys("Something somewhere 7");
    driver.findElement(By.id("cart-customer-postal-code")).sendKeys("99999");
    driver.findElement(By.id("cart-customer-city")).sendKeys("London");
    driver.findElement(By.name("cart[customer][email]")).sendKeys("fbrazao6@gmail.com");
    driver.findElement(By.name("cart[customer][phone_number]")).sendKeys("00000000");
    driver.findElement(By.cssSelector("#customer-data > .row-two-inputs:nth-child(4) .col-12:nth-child(1)")).click();
    driver.findElement(By.id("ui-id-17")).click();
    driver.findElement(By.id("cart-customer-postal-code")).sendKeys("W3  9YU");
    driver.findElement(By.cssSelector(".col-12:nth-child(1) > .row label")).click();
    driver.findElement(By.cssSelector(".delivery-finish-buttons > .pink")).click();
    driver.findElement(By.cssSelector(".input-group-checkbox > label")).click();
    driver.findElement(By.cssSelector(".payment-method-row:nth-child(1) > .col-12")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.id("credit-card-number")).click();
    driver.findElement(By.id("credit-card-number")).sendKeys("9997 7776 5554 3333");
    driver.switchTo().defaultContent();
    driver.switchTo().frame(2);
    driver.findElement(By.id("expiration")).click();
    driver.findElement(By.id("expiration")).sendKeys("12 / 2222");
    driver.switchTo().defaultContent();
    driver.switchTo().frame(1);
    driver.findElement(By.id("cvv")).click();
    driver.findElement(By.id("cvv")).sendKeys("333");
  }
}
