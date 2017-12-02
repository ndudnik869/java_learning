package com.home.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("Nadezhda");
    hello("Viktor");

    Square s = new Square(5);
    Rectangle r = new Rectangle(2, 6);

    System.out.println("Area of square with side " + s.l +" = " + s.area());

    System.out.println("Area of rectangle with sides " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }



}