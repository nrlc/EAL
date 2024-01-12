package Task01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task01 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\chy_h\\OneDrive\\Desktop\\EALClassTutorial\\EALClassTask\\webdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		entercapcha();
		WebElement Best_Sellers= driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Thread.sleep(8000);
		Best_Sellers.click();
		String current_url= driver.getCurrentUrl();
		System.out.println(current_url);
		Thread.sleep(10000);
		//WebElement New_Releases = driver.findElement(By.xpath("(//a[text()='New Releases'])[2]"));
		WebElement New_Releases = driver.findElement(By.linkText("New Releases"));
		New_Releases.click();
		String tile = driver.getTitle();
		System.out.println(tile);
		Thread.sleep(8000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("Phones");
		Thread.sleep(8000);
		WebElement search_button =  driver.findElement(By.id("nav-search-submit-button"));
		search_button.click();
		String search_url = driver.getCurrentUrl();
		System.out.println(search_url);
		driver.navigate().back();
		Thread.sleep(8000);
		WebElement all_search= driver.findElement(By.className("nav-search-dropdown.searchSelect.nav-progressive-attrubute.nav-progressive-search-dropdown"));
		all_search.click();
		Thread.sleep(8000);
		//WebElement Alexa_Skills = driver.findElement(By.id("alexa-skills"));
		//Alexa_Skills.click();
	
	}
	public static void entercapcha()
	{
		By ele=By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']");
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMinutes(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(ele));

	}

}
