import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import framework.VerificationPoint;

public class SeleniumTestes {

	private WebDriver driver = new FirefoxDriver();
	private VerificationPoint verification = new VerificationPoint(driver);
		
	
	@Test
	public void testLogin() {

		driver.get("http://192.168.1.254/gestao/index.php");
		
		driver.findElement(By.xpath("//*[@id=\"form_login\"]/table/tbody/tr[2]/td/div/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"form_login\"]/table/tbody/tr[3]/td/div/input")).sendKeys("admin");
		
		
		driver.findElement(By.id("tbutton_save")).click();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		verification.contains("Welcome ao Gestão");

		//driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"adianti_div_content\"]/div/div/div/div/div[2]/align=\"center\"/img")));

		//WebElement login = driver.findElement(By.xpath("//*[@id=\"adianti_div_content\"]/div/div/div/div/div[2]/align=\"center\"/img"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		//assertTrue(login.getText().contains("Welcome"));
		
		
		
		//assertTrue(driver.findElement(By.xpath("//*[contains(text(), '//*[@id=\"adianti_div_content\"]/div/div/div/div/div[1]/div/h4')]")).isDisplayed());
		
		//	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/center/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/table/tbody/tr/td[2]/a[1]")).click();
		
		/*
		 * 		return this.driver.findElement(By.id("jform_name"));
		registration.getNameTextField().sendKeys("Gustavo Reichelt");

		 * 
		 */
		
		
	}

}
