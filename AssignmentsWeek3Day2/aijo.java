package AssignmentsWeek3Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aijo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//Precondition:
				//- Initialize the WebDriver (ChromeDriver).
				//- Load the URL http://leaftaps.com/opentaps/. .
				//- Maximize the browser window.
		
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
				ChromeDriver driver=new ChromeDriver();
				//Launch the URL https://www.ajio.com/
				driver.get("https://www.ajio.com/");
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				Thread.sleep(3000); 
				
				Thread.sleep(1000);
				//In the search box, type as "bags" and press enter
				driver.findElement(By.tagName("input")).sendKeys("bags"); 
				Thread.sleep(1000);
				driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				//To the left of the screen under "Gender" click on "Men"
				driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[3]")).click();
				Thread.sleep(5000); 
				//Under "Category" click "Fashion Bags"
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(5000); 
				//Print the count of the items found.
				String itemsFound = driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
				System.out.println(itemsFound.split(" ")[0]);
				Thread.sleep(5000); 
				//Get the list of brand of the products displayed in the page and print the list.
				List<WebElement> brandElements = driver.findElements(By.className("brand"));
				for (int i = 0; i < brandElements.size(); i++) 
				{

				    System.out.println("Brand Name is : "+brandElements.get(i).getText());
				}
				//Get the list of names of the bags and print it

				List<WebElement> nameElements = driver.findElements(By.className("nameCls"));

				for (int j = 0; j < nameElements.size(); j++) 
				{
				    System.out.println("Bag Name: "+nameElements.get(j).getAttribute("aria-label")); 
				}
				driver.close();
	}

}
