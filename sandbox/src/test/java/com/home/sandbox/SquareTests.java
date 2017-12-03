package com.home.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 02.12.2017.
 */
public class SquareTests {
  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
