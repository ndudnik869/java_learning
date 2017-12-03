package com.home.qa.addressbook.tests;

import com.home.qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by 1 on 03.12.2017.
 */
public class GroupModificationTest extends TestBase{
  @Test
  public void testGroupModification(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("newTest1", "newTest2","newTest3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
