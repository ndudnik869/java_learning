package com.home.qa.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by 1 on 03.12.2017.
 */
public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
