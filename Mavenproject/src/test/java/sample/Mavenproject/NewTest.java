package sample.Mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest{
	public static WebDriver d;
  @Test
  public void f() {
	  d=new FirefoxDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  d.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	  d.findElement(By.id("Email")).sendKeys("bhavani.athukuri84");
	  
  }
}
