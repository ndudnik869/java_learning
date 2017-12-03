package com.home.qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

/**
 * Created by 1 on 03.12.2017.
 */
public class ApplicationManager {
  WebDriver driver;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  private StringBuffer verificationErrors = new StringBuffer();

  public void init() {
    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/");

    groupHelper = new GroupHelper(driver);
    sessionHelper = new SessionHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    driver.findElement(By.linkText("Logout")).click();
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

}
