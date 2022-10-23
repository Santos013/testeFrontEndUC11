package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesCursoSenai {
	// representa o navegador
	private WebDriver driver;
	
	//pre-teste
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Felipe Santos\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();//abrir o navegador
		driver.manage().window().maximize();//maximizar o navegador
	}
	
	//teste
	@Test
	public void TesteNavegabilidade() {
		this.driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();

	}
}
