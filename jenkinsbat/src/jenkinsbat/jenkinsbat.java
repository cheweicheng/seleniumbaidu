package jenkinsbat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkinsbat {
	@Test
	public void open() throws InterruptedException {
		//打开浏览器
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		//定义网址
		String url="https://www.baidu.com";
		//用浏览器打开网址
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("周测");
		driver.findElement(By.id("su")).click();
				
}
	}
