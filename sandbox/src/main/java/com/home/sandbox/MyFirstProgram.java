package com.home.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("Nadezhda");
    hello("Viktor");
    double l = 5;
    double a = 2;
    double b = 6;
    System.out.println("Area of square = " + area(l));

    System.out.println("Area of прямоугольника со сторонами " + a + " and " + b + " = " + area(a,b));
}

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len){
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }

}