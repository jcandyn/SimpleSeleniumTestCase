package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSe {
public static void main(String[] args) {
	System.out.println("Hello");
	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\joscandy.nunez\\Downloads\\chromedriver_win32_actual\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("disney");
	element.submit();
}
}

