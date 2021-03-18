package session10;

public class Cynlinder extends Circlea {
  // khai bao heght
  private double height;

  //Constructor ( xay dung)
  public Cynlinder() {
    super();
    this.height = 1.0;
    System.out.println("Constructor a Cynlinder with Cynlinder()");
  }

  public Cynlinder(double height) {
    super();
    this.height = height;
    System.out.println("Constructor a Cynlinder with Cynlinder(height)");
  }

  public Cynlinder(double height, double radius) {
    super(radius);
    this.height = height;
    System.out.println("Constructor a Cynlinder with Cynlinder(height,radius)");
  }
  public Cynlinder(double height, double radius, String color) {
    super(radius,color);
    this.height = height;
    System.out.println("Constructor a Cynlinder with Cynlinder(height,radius,color)");
  }
  //getter and setter
  public double getHeight(){
    return this.height;
  }
  public void setHeight(double height){
    this.height = height;
  }
  /*public String toString(){
    return "This is a Cynlinder";
  }*/
  public double getArea(){
    return 2*Math.PI*getRadius()*height+2*super.getArea();
  }
  public  double getVolume(){
    return super.getArea()*height;
  }
  public String toString(){
    return "Cynlinder [" + super.toString()+ ",height" +height + "]";
  }
}
