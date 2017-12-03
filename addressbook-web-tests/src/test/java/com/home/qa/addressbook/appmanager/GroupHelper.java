package com.home.qa.addressbook.appmanager;

import com.home.qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 03.12.2017.
 */
public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
   }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void deleteSelectedGroups() {
    click(By.cssSelector("input[name=\"delete\"]"));
  }

  public void selectGroup() {
    click(By.cssSelector("input[type=\"checkbox\"]"));
  }
}
