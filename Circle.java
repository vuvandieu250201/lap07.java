package session10;

public class Circle {
  //private instance radius
  private double radius;
  private String color;

  // Constructior
  public Circle(){
    this.radius = 1.0;
    this.color = "red";
    System.out.println("Construced a Circle with Circle(radius)");
  }
  public Circle(double radius){
    this.radius = radius;
    this.color = color;
    System.out.println("Construced a Circle with Circle(radius, color");
  }
  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;

  }
}
