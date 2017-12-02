package com.home.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("Nadezhda");
    hello("Viktor");

    Square s = new Square(5);
    Rectangle r = new Rectangle(2, 6);

    System.out.println("Area of square with side " + s.l +" = " + area(s));

    System.out.println("Area of rectangle with sides " + r.a + " and " + r.b + " = " + area(r));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}