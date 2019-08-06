package com.Headless.HeadlessTesting1;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {
		// Creating a new instance of the HTML unit driver

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Thilina\\Eight25Automation\\config\\chromedriver.exe"); WebDriver driver
		 * = new ChromeDriver();
		 */
		File src = new File(
				"C:\\Users\\Thilina Ranaruwan\\Desktop\\Automation\\Jars\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();

		// Navigate to Google
		driver.get("http://www.google.com");

		// Locate the searchbox using its name
		WebElement element = driver.findElement(By.name("q"));

		System.out.println("Page title is: " + driver.getTitle());

		WebElement test = driver.findElement(By.linkText("Gmail"));
		test.click();

		// Enter a search query
		// element.sendKeys("Guru99");

		// Submit the query. Webdriver searches for the form using the text input
		// element automatically
		// No need to locate/find the submit button
		// element.submit();

		System.out.println("Page title is: " + driver.getTitle());

		WebElement test1 = driver.findElement(By.linkText("Sign in"));
		test1.click();

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		// driver.close();
		// driver.switchTo().window(tabs2.get(0));

		// This code will print the page title
		System.out.println("Page title is: " + driver.getTitle());

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("thilina.r@eight25media.com");

		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		System.out.println("Clicked 'Next' button to go to Password Entering page ");

		System.out.println("User is at password entering page");

		System.out.println("Page title is: " + driver.getTitle());

		Thread.sleep(5000);

		driver.findElement(By.name("password")).sendKeys("19911129");

		System.out.println("Filled the Correct password");

		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).click();

		System.out.println("Logged in to the Gmail sucessfully");
		// driver.quit();
	}
}
