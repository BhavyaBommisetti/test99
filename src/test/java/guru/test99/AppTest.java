package guru.test99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "/usr/bin/chromedriver");
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("window-size=1024,768");
		options.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(options);
       /* String eTitle = "Meet Guru99";
        String aTitle = "";
        driver.get("http://www.guru99.com/");
        driver.manage().window().maximize();
        aTitle = driver.getTitle(); 
        if (aTitle.contentEquals(eTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }        
        driver.close();
		*/
	 
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("searchInput")).sendkeys("wipro");
		driver.findElement(By.className("pure-button")).click();
		
		String h= driver.getTitle();
		String e= "wipro - wikipedia";
		driver.close();
		if(h.equalsIgnoreCase(e)){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
}

