package Lamdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenario1 {

	public static void main(String[] args) {
		
		//1. Open LambdaTest’s Selenium Playground from https://www.lambdatest.com/selenium-playground
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
		
		//2. Click “Simple Form Demo” under Input Forms.
		driver.findElement(By.linkText("Simple Form Demo")).click();
		
		//3. Validate that the URL contains “simple-form-demo”.
		String url = driver.getCurrentUrl();
		if(url.contains("simple-form-demo")) 
		{
			System.out.println("URL contains simple-form-demo");			
		}
		
		//4. Create a variable for a string value E.g: “Welcome to LambdaTest”.
		String Str = "Welcome to LambdaTest";
		System.out.println(Str);
		
		//5. Use this variable to enter values in the “Enter Message” text box.
		WebElement Actual_txt = driver.findElement(By.xpath("(//input[@id='user-message'])[1]"));
		Actual_txt.sendKeys(Str);
		
		
		//6. Click “Get Checked Value”.
		driver.findElement(By.id("showInput")).click();
		
		//7. Validate whether the same text message is displayed in the right-hand panel under the “Your Message:” section.
		String displayed_text = driver.findElement(By.id("message")).getText();
		System.out.println(displayed_text);
		System.out.println(displayed_text.equals(Str));
		//driver.close();
		
		
	}

}
