package seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		//input[@class = 'decorativeSubmit']
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		//a[text() = 'Find Leads']
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		//span[text() = 'Phone']
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		//input[@id= 'ext-gen270']
		
		driver.findElement(By.xpath("//input[@id= 'ext-gen270']")).sendKeys("8300959837");
		
		//button [text() = 'Find Leads']
		driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		//a[text() = 'Find Leads']
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		
		//a[text() = '10217']
		driver.findElement(By.xpath("//a[text() = '10222']")).click();
		
		//a[text() = 'Delete']
		
		//a[text() = 'Delete']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		//input[@id ='ext-gen246']
		
		driver.findElement(By.xpath("//input[@id ='ext-gen246']")).sendKeys("10222");
		//button[@id ='ext-gen334']
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id ='ext-gen334']")).click();
		
		
		
		
		
		
	}

}
