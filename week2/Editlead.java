package seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

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
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		
		//a[text() = 'Create Lead']
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		
		//input[contains (@id, 'createLeadForm')]
		driver.findElement(By.xpath("//input[contains (@id, 'createLeadForm')]")).sendKeys("Atos Syntel");
		//input[@name = 'firstName' ]
		driver.findElement(By.xpath("//input[contains (@id,'firstName')]")).sendKeys("Narmathaa");
		//input[contains (@id, 'lastName')]
		driver.findElement(By.xpath("//input[contains (@id, 'lastName')]")).sendKeys("Vivek");
		//input[contains (@id, 'firstNameLocal')]
		driver.findElement(By.xpath("//input[contains (@id, 'firstNameLocal')]")).sendKeys("Nami");
		//input[contains (@id, 'departmentName')]
		driver.findElement(By.xpath("//input[contains (@id, 'departmentName')]")).sendKeys("ECE");
		//textarea[contains (@id, 'description')]
		driver.findElement(By.xpath("//textarea[contains (@id, 'description')]")).sendKeys("Software testing - testleaf");
		//input[contains (@id, 'primaryEmail')]
		driver.findElement(By.xpath("//input[contains (@id, 'primaryEmail')]")).sendKeys("narmathaavive@gmail.com");
		//select[contains (@id, 'StateProvinceGeoId')]
		
        WebElement  nam = driver.findElement(By.xpath("//select[contains (@id, 'StateProvinceGeoId')]"));
		
		Select su= new Select(nam);
		
		su.selectByVisibleText("New York");
		
		//input [@name = 'submitButton']
		driver.findElement(By.xpath("//input [@name = 'submitButton']")).click();
		//div[@class='frameSectionExtra']/a[3]
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		driver.findElement(By.xpath("//textarea[contains (@id, 'description')]")).clear();
		//textarea [contains (@id, 'LeadForm_importantNote')]
		driver.findElement(By.xpath("//textarea [contains (@id, 'LeadForm_importantNote')]")).sendKeys("Automation testing- Test leaf");
		
		//input [@class= 'smallSubmit'][1]
		driver.findElement(By.xpath("//input [@class= 'smallSubmit'][1]")).click();
		
		String title = driver.getTitle();
		System.out.println("title of the page : "+title);
		
		Thread.sleep(3000);
				driver.close();
		
		
		
		
	}

}
