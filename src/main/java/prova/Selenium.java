package prova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/home/daniel/programs/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//
//		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/usr/local/bin/phantomjs");
//		PhantomJSDriver driver = new PhantomJSDriver(caps);
		driver.get("http://www.google.com.br/");

		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("icmc");

		// submete o form
		campoDeTexto.submit();
	}

}
