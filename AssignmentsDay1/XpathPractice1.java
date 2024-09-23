package AssignmentsDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//Driver.findElement(By.locator("value"));
		
		//id        -always- N: numbers
					//driver.findElement(By.id("elementID"))
		//name      - if id does not exist N:Duplicates
					//driver.findElement(By.name("elementName"))
		//className - Unique class without white spaces N:White Space & Duplicates
					//driver.findElement(By.className("className"))
		//linkText  - If its link <a> - N:Duplicates
				    //driver.findElement(By.linkText("Link Text"))
		//partial-link-text -
					//driver.findElement(By.partialLinkText("Partial Text"))
		//tagName   - collection of objects N:Duplicates
					//driver.findElement(By.tagName("tagName"))
		//Xpath     - if none of the above works-N: xpath can change
					//driver.findElement(By.xpath("XPathExpression"))
		
		//ATTRIBUTE  : tagName[@attribute='attribute value'] e.g. //input[@id='search']
		//PARTIAL AB : tagName[contains(@attribute,'partial value')] e.g. //input[contains(@class,'Submit')]
		//TEXT       : tagName[text()='text value in DOM'] e.g. //span[text()='Learn More']
		//PARTIALTEXT: tagName[contains(text(),'partial text'] e.g. //a[contains(text()='Learn']
		//COLLECTION : tagName[@atttribute='attributeValue'][index] e.g. // //input[@type='text'][1]
		
		//username:demosalesmanager ------ password:crmsfa
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestAccount991");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);

		if(title.contains("Account Details | opentaps CRM")) 
		{
			System.out.println("Title is verified");
		}
		else 
		{
			System.out.println("Title is not verified");
		}

		
		//driver.close();
	}

}
