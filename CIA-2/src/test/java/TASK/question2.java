package TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("==remote=allow=origins=*");
	  WebDriver driver= new ChromeDriver(co);
	  driver.get("https://www.trivago.in/en-IN/lm/hotels-bengaluru-india?search=132-7;200-64975;dr-20230506-20230512;rc-1-3");
	  driver.manage().window().maximize();
	  WebElement recom =driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
	  recom.click();
	  Select sel1 = new Select(recom);
	  sel1.selectByIndex(3);
	  WebElement name1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
	  System.out.println(name1.getText());
	  WebElement price1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p"));
	  System.out.println(price1.getText());
	  WebElement sortprice =driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
	  sortprice.click();
	  WebElement stays=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]/strong"));
	  System.out.println(stays.getText());
	  WebElement booking=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/span[2]/strong"));
	  System.out.println(booking.getText());
  }
}
