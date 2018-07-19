package java_con_junit;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import utils.Locators;


public class CP_Facebook_Base {
	protected Wait<WebDriver> wait;
	protected WebDriver driver;
	
	//@Before
				
		protected void setUp(String browser, String url) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.out.println("Arranca el browser porfa y navega a la pagina.");
			System.setProperty(utils.Properties.CHROME_BROWSER_PROPERTY,utils.Properties.CHROME_DRIVER);
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(utils.Properties.LONG_WAIT, TimeUnit.SECONDS);
			
			
			wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
			        .pollingEvery(Duration.ofMillis(2))
			        .ignoring(NoSuchElementException.class);
			
			
    	//driver.get("http://www.facebook.com"); 
				
	}
		
	public void logIntoFacebook(String user, String password) {
		WebElement campoUsuario = driver.findElement(Locators.USER_LOCATOR);
		WebElement campoPassword = driver.findElement(Locators.PASS_LOCATOR);
		WebElement botonLogin = driver.findElement(Locators.BOTONLOG_LOCATORS);
		
		campoUsuario.sendKeys(user);
		campoPassword.sendKeys(password);
		botonLogin.click();	
		}
		
		
	
	
	/*public WebElement fluentWait(final By locator){
	    

	    return wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	  
	};
	*/
	
	protected void searchFacebookFriend(String friendName) {
		WebElement seachfriendfild = driver.findElement(Locators.NAME_SEACH_FRIEND_LOCATOR);
		seachfriendfild.sendKeys(friendName);
		
		
		WebElement botonbuscar = driver.findElement(By.xpath("//button[@value='1']"));
		botonbuscar.click();
	}

	
	
	protected void viewfriend() {
		
		WebElement veramigo = driver.findElement(By.xpath("//div[@class='_52eh _5bcu']"));
		veramigo.click();
		

	}
	
	
	
	
protected void gotoPhotos() {
		
	WebElement verfotos = driver.findElement(By.xpath("//a[@data-tab-key='photos']"));
		verfotos.click();
				
			
	}


	protected void viewPhoto() {
		
		WebElement verfoto = driver.findElement(By.xpath("//div[@class='tagWrapper']"));
		verfoto.click();
		
	
	}
		protected void likeAllPhotos() {
		
		
			WebElement darlike = driver.findElement(By.xpath("//div[@class='_khz _4sz1 _4rw5 _3wv2']"));
			darlike.click();
	}

	@After
	public void tearDown() {
		System.out.println("Destruye la configuracion");
		//driver.quit();
	}
	
	

}

	

