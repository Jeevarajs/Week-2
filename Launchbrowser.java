package Week2.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String text = driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();
String title = driver.getTitle();
System.out.println(title);

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Blueberry");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopal");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation testing");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("23/05/95");
//driver.findElement(By.id("")).sendKeys("");









//driver.close();
	}
}
