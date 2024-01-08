package Lamdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenario3 {

	public static void main(String[] args) {
		
		//1. Open the https://www.lambdatest.com/selenium-playground page and click “Input Form Submit” under “Input Forms”.	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Input Form Submit")).click();
		
		//2. Click “Submit” without filling in any information in the form.
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//3. Assert “Please fill in the fields” error message.
		//4. Fill in Name, Email, and other fields.
		driver.findElement(By.id("name")).sendKeys("Muthukumaran");
		driver.findElement(By.id("inputEmail4")).sendKeys("muthukumaran0510@gmail.com");
		driver.findElement(By.id("inputPassword4")).sendKeys("admin");
		driver.findElement(By.id("company")).sendKeys("Accenture");
		driver.findElement(By.id("websitename")).sendKeys("www.google.co.in");
		
		//5. From the Country drop-down, select “United States” using the text property.
		WebElement dropwon = driver.findElement(By.xpath("//select[contains(@class,'w-full border')]"));
		Select select = new Select(dropwon);
		select.selectByVisibleText("United States");
		driver.findElement(By.id("inputCity")).sendKeys("chennai");
		driver.findElement(By.id("inputAddress1")).sendKeys("No 2 murugesan Nagar");
		driver.findElement(By.id("inputAddress2")).sendKeys("Chidambaram");
		driver.findElement(By.id("inputState")).sendKeys("Tamil Nadu");
		driver.findElement(By.id("inputZip")).sendKeys("605757");
		
		//6. Fill all fields and click “Submit”.
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		
		//7. Once submitted, validate the success message “Thanks for contacting us, we will get back to you shortly.” on the screen.
		
			String thank = "Thanks for contacting us, we will get back to you shortly.";
			String thank_out = driver.findElement(By.xpath("//p[@class='success-msg hidden']")).getText();
			System.out.println(thank_out);
			System.out.println(thank.equals(thank_out));
			//driver.close();
			
		
		
	}

}
;