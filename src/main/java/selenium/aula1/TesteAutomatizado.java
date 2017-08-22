package selenium.aula1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/home/daniel/programs/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/daniel/programs/chromedriver");
//		WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com.br/");

		WebElement campoTexto =  driver.findElement(By.name("q"));

		campoTexto.sendKeys("Dragon Ball Z");

		campoTexto.submit();
	}

}