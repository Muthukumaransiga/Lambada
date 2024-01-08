package Lamdatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScenario2 {

	public static void main(String[] args) {
		
		//1. Open the https://www.lambdatest.com/selenium-playground page and click “Drag & Drop Sliders” under “Progress Bars & Sliders”.	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Drag & Drop Sliders")).click();
		
		//2. Select the slider “Default value 15” and drag the bar to make it 95 by validating whether the range value shows 95.		
		WebElement slider = driver.findElement(By.xpath("(//input[@type='range'])[3]"));
		WebElement output = driver.findElement(By.id("rangeSuccess"));		
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 215, 0).perform();
		System.out.println(output.getText());
		
			
		
		
	}

}
;