package session10;

public class Circlea{
  // khai bao bien private
  private double radius;
  private String color;
  //Constructos
  public Circlea(){
    this.radius = 1.0;
    this.color = "red";
    System.out.println("Contruced a Circle with Circle()");
  }
  public Circlea(double radius){
    this.radius = radius;
    this.color = "red";
    System.out.println("Contruced a Circle with Circle(radius)");
  }
  public Circlea(double radius,String color){
    this.radius = radius;
    this.color = "color";
    System.out.println("Contruced a Circle with Circle(radius,color)");
  }
  // public getter and setter...
  public double getRadius(){
    return this.radius;
  }
  public String getColor(){
    return this.color;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public void setColor(String color){
    this.color = color;
  }
  public String toString(){
    return "Circle[radius ="+ radius +",color =" +color +"]";
  }
  public double getArea(){
    return radius*radius*Math.PI;
  }
}
