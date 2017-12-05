package com.home.qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 03.12.2017.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

   public void goToGroupPage() {
     if (isElementPresent(By.tagName("h1")) &&
             driver.findElement(By.tagName("h1")).getText().equals("Groups") &&
             isElementPresent(By.name("new"))) {
       return;
     }
       click(By.linkText("groups"));
  }
}
