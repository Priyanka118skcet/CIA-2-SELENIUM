package TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public static void main(String args[]) throws InterruptedException
  {
  WebDriverManager.chromedriver().setup();
  WebDriver driver;
  ChromeOptions co = new ChromeOptions();
  co.addArguments("--remote-allow-origins=*");
  driver = new ChromeDriver(co);
  driver.get("https://www.trivago.in/");
  driver.manage().window().maximize();
  String title=driver.getTitle();
  System.out.println("Title of the page : "+driver.getTitle());
  if(title.equals(driver.getTitle()))
  System.out.println("Title validated");
  else
  System.out.println("Title  not validated");
  WebElement location=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
      location.click();
      WebElement option=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[2]/div/div"));
      option.click();
      Thread.sleep(2000);
      WebElement cin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[6]/time"));
      cin.click();
      Thread.sleep(2000);
      WebElement cout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[12]/time"));
      cout.click();
      Thread.sleep(2000);
      WebElement guest=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
      guest.click();
      Thread.sleep(2000);
      WebElement pet=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]"));
      pet.click();
      Thread.sleep(2000);
      WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
      apply.click();
      Thread.sleep(20000);
      
      WebElement recom =driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
	  recom.click();
	  Select sel1 = new Select(recom);
	  sel1.selectByIndex(3);
      
      
      
      
      
      
      
      
     
  }
}
