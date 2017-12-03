package com.home.qa.addressbook;

import org.testng.annotations.Test;

/**
 * Created by 1 on 03.12.2017.
 */
public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion(){
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
