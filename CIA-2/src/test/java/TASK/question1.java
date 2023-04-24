package TASK;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
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
  System.out.println(driver.getTitle());
  if(title.equals(driver.getTitle()))
  System.out.println("Title is valid");
  else
  System.out.println("Title is not valid");
    
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
      Thread.sleep(2000);
      WebElement search =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button"));
	  search.click();
	  Thread.sleep(2000);
	  WebElement hotel =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div/label"));
	  hotel.click();
	  Thread.sleep(2000);
	  WebElement rating =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span/span[2]"));
	  rating.click();
	  Thread.sleep(2000);
	  WebElement property =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button/span/span[2]"));
	  property.click();
	  Thread.sleep(2000);
	  WebElement wifi =driver.findElement(By.xpath(""));
	  wifi.click();
	  Thread.sleep(2000);
	  WebElement pool =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button"));
	  pool.click();
	  Thread.sleep(2000);
     
  }
  
	
  }

