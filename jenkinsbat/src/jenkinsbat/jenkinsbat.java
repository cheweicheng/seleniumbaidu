package jenkinsbat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jenkinsbat {
	@Test
	public void open() throws InterruptedException {
		//�������
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		//������ַ
		String url="https://www.baidu.com";
		//�����������ַ
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("�ܲ�");
		driver.findElement(By.id("su")).click();
				
}
	}
