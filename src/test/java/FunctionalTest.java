import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FunctionalTest {

	private WebDriver driver;
	DriverManagerConfig dmc;
	
	@Before
	public void setup() {
		dmc = new DriverManagerConfig();
		driver = dmc.browser("edge");
	}
	
	@Test
	public void verificarSeAPaginaContemUmHeaderComUmHelloWorld() {
		driver.get("http://localhost:8080/gestaodeconfig");
		
		WebElement h1 = driver.findElement(By.tagName("h1"));
		
		
		assertEquals("Hello World!", h1.getText());
	}
	
}
