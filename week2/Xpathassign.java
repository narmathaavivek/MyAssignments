package seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathassign {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		String Title = driver.getTitle();
		System.out.println("get title"+Title);
		if(Title.contains("TestLeaf Automation Platform")) {
			System.out.println("login succeccful");
		}else{
				System.out.println("login failed");
			}
		
	    
	     driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	     driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("jaya");
	     driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
	     
	     WebElement data = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
	     Select opt=new Select (data);
	     opt.selectByIndex(3);
	     
	     WebElement data1 = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
	     Select opt1=new Select(data1);
	     opt1.selectByVisibleText("S-Corporation");
	     
	     
	     WebElement data3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	     Select opt3=new Select(data3);
	     opt3.selectByVisibleText("Employee");
	     
	     
	     WebElement data4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	     Select opt4=new Select(data4);
	     opt4.selectByIndex(6);
	     
	    
	     WebElement data5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	     Select opt5=new Select(data5);
	     opt5.selectByVisibleText("Texas");
	     
	     driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	     
	     String text = driver.findElement(By.xpath("//td[@id='ext-gen1184']")).getText();
	     
	     if(text.contains("jaya")) {
	    	 System.out.println("account created");
	     }else {
	    	 System.out.println("account not created");
	     }
	}
}
