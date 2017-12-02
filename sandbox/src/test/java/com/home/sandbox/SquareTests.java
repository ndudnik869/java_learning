package com.home.sandbox;

import org.testng.annotations.Test;

/**
 * Created by 1 on 02.12.2017.
 */
public class SquareTests {
  @Test
  public void testArea(){
    Square s = new Square(5);
    assert s.area() == 25;
  }
}
