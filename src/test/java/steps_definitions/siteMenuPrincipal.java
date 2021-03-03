package steps_definitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class siteMenuPrincipal {

	private AndroidDriver<MobileElement> driver;

	//Configuração Android
	@Before
	public void configuraco() throws MalformedURLException {
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10.0");
		cap.setCapability("automationName","UIAutomator2");
		cap.setCapability("browserName","Chrome");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(remoteUrl,cap);
		espera();
	}
	//Finaliza Aplicação
	@After
	public void finalizar(){
		driver.quit();
	}


	//Metodos
	public void espera(){
		driver.manage().timeouts().implicitlyWait(50000,TimeUnit.MILLISECONDS);
	}
	public void botao(){
		WebElement linha = driver.findElement(By.cssSelector("div[class*=visible-xs]"));
		linha.findElement(By.cssSelector("button[type*=button]")).click();
		espera();

	}
	public void escolhe_menu(String escolha_menu){
		driver.findElement(By.linkText(escolha_menu)).click();
	}
	public void escolhe_menu_servico(String servicoMenu){
		WebElement botaoMenu = driver.findElement(By.id("menu-menu-topo-1"));
		espera();
		botaoMenu.findElement(By.cssSelector("span[class*=toggler]")).click();
		driver.findElement(By.linkText(servicoMenu)).click();
	}
	public void valida_escolha(String url, String texto){
		String urlAtual = driver.getCurrentUrl();
		String textoAtual = driver.findElement(By.cssSelector("h1[class*=titulo]")).getText();

		Assert.assertEquals(url,urlAtual);
		Assert.assertEquals(texto,textoAtual);
	}



	//Todos Cenarios
	@Dado("que esteja na home da pagina")
	public void queEstejaNaHomeDaPagina() {
		driver.get("https://auditeste.com.br/");
		espera();
		driver.findElement(By.cssSelector("img[class*=button]")).click();
	}
	

	// Cenario Menus Principais
	@Quando("eu clico no Menu e escolho {string}")
	public void euClicoNoMenuEEscolhoTitulo(String titulo) {
		botao();
		escolhe_menu(titulo);
	}

	@Entao("deve ir para {string} e mostrar {string}")
	public void deveIrParaUrlEMostrarTexto(String urlEsperada,String textoEsperado) {
		valida_escolha(urlEsperada,textoEsperado);
	}


	// Cenario Menu Serviços
	@Quando("eu clico no Menu Servico e escolho {string}")
	public void euClicoNoMenuServicoEEscolhoTitulo(String servico) {
		botao();
		escolhe_menu_servico(servico);

	}

	@Entao("devera ir para {string} e mostrar {string}")
	public void deveraIrParaUrlEMostrarTexto(String urlServico,String textoServico) {
		valida_escolha(urlServico,textoServico);
	}


}
