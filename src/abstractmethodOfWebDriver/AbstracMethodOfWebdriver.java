package abstractmethodOfWebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AbstracMethodOfWebdriver {

	public static void main(String[] args) throws InterruptedException, AWTException {
//		// get("URL") - void
//		     get();
//		// quite();	  - void
//		     quit();
//		// close();	  - void
//		     close();
//		// getCurrentUrl()-String
//		     getCurrentUrl();
//		// getPageSource() - String
//		     getPageSource();
//		// getTitle()  - String
//		     getTitle(); 
//		// findElement() - WebElement
//		     findElement();
//		// findElements() - List<WebElement>
//		     findElements();
//		// getWindowHandle() - String (provides parent browser address )
//		     getWindowHandle();
//		// getWindowHandles()- set<String> (provides all browser
//		    // address but first will be parent browser
//		     getWindowHandles();
//		// manage()  - Options
//		     manage();
//		// navigate()  - Navigation
//		     navigate();
//		// switchTo();  - TargetLocator
//		     switchTo();
	}

	private static void switchTo() throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(findElement).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease((KeyEvent.VK_DOWN));
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<>(windowHandles);
		String string = al.get(1);
		driver.switchTo().window(string);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Devendra");
		Thread.sleep(1000);
		driver.quit();
		
		
	}

	private static void navigate() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();
		


		
	}

	private static void manage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
		
	}

	private static void getWindowHandles() throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(findElement).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease((KeyEvent.VK_DOWN));
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String a: windowHandles)
		{
			System.out.println(a);
		}
		driver.quit();
	}

	private static void getWindowHandle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
	}

	private static void findElements() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		List<WebElement> findElements = driver.findElements(By.xpath("//a"));
		Thread.sleep(1000);
		for(WebElement a:findElements)
		{
			System.out.println(a.getText());
		}
	}

	private static void findElement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("devendra");
		Thread.sleep(2000);
		driver.quit();

		
	}

	private static void getTitle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

		
	}

	private static void getPageSource() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.quit();
		
	}

	private static void getCurrentUrl() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();

		
	}

	private static void close() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.close();
		
	}

	private static void quit() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.quit();

		
	}

	private static void get() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		driver.quit();
	}

}
