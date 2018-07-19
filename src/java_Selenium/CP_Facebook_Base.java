package java_Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CP_Facebook_Base {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		
		
		
		setUp("chorme", "https://www.facebook.com");
		iniciarSesion("armandorobles20@yahoo.com","2020tigres");
				searchFacebookFriend("jen vazquez");
	
		
	}
	
	
		public static void main(String browser, String url) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.out.println("Arranca el browser porfa y navega a la pagina.");
			System.setProperty("webdriver.chrome.driver","C:\\test_automation\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
		
	}
		
		
	

	private static void setUp(String WebDriver, String url) {
		
		//String pathToDriver = ;
        System.setProperty("webdriver.chrome.driver","C:\\test_automation\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    	driver.get("http://www.facebook.com"); 
		

		
	}


	private static void iniciarSesion(String usuario, String contraseña) {
		
		WebElement campoUsuario = driver.findElement(By.id("email"));
		WebElement campoPassword = driver.findElement(By.id("pass"));
		WebElement botonLogin = driver.findElement(By.id("loginbutton"));
		
		campoUsuario.sendKeys(usuario);
		campoPassword.sendKeys(contraseña);
		botonLogin.click();	
		
	
	}

	protected static  void searchFacebookFriend(String friendName) {
		WebElement seachfriendfild = driver.findElement(By.xpath("//input[@data-testid='search_input']"));
		seachfriendfild.sendKeys(friendName);
		
		
		WebElement botonbuscar = driver.findElement(By.xpath("//button[@value='1']"));
		botonbuscar.click();
	}

	
	
	protected void viewfriend() {
		
		WebElement veramigo = driver.findElement(By.xpath("//div[@class='_52eh _5bcu']"));
		veramigo.click();
		
WebElement botonmensaje = driver.findElement(By.xpath("//i[@class='_3-8_ img sp_AUho9HwMhEt sx_9a6bde']"));
		
		botonmensaje.click();
		

	}
	
	
	
	
protected void gotoPhotos() {
		
		WebElement verfotos = driver.findElement(By.xpath("//a[@data-tab-key='photos']"));
		verfotos.click();
		
		WebElement verfoto = driver.findElement(By.xpath("//div[@class='tagWrapper']"));
		verfoto.click();
		
	
		
	}


	@After
	public void tearDown() {
		System.out.println("Destruye la configuracion");
		//driver.quit();
	}
	

}