package TASK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question3 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("==remote=allow=origins=*");
	  WebDriver driver= new ChromeDriver(co);
	  driver.get("https://www.trivago.in/en-IN/srl/cheap-hotels-pondicherry-india?search=200-64948;300-254;300-658;dr-20230509-20230510;so-4");
	  driver.manage().window().maximize();
	  List<WebElement> li =  driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
	  for(WebElement l:li)
	  System.out.println(l.getText()+" ");
	  WebElement viewdeal =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button"));
	  viewdeal.click();
	  WebElement priceofhostel=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p"));
      priceofhostel.click();
      
  }
}
