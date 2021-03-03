package navegador;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Navegador{

	private AndroidDriver<MobileElement> driver;

	@Before
	public void configuraco() throws MalformedURLException {
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10.0");
		cap.setCapability("automationName","UIAutomator2");
		cap.setCapability("browserName","Chrome");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(remoteUrl,cap);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	}

	@After
	public void finalizar(){
		driver.quit();
	}

	@Test
	public void acessaNavegador(){
		driver.get("https://google.com");
	}
}
