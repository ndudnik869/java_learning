package com.home.qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 03.12.2017.
 */
public class SessionHelper extends  HelperBase{

  public SessionHelper(WebDriver driver) {
    super(driver);
  }
  public void login(String userName, String password) {
    type(By.name("user"), userName);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
   }
}
