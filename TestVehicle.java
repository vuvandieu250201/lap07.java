package session10;

public class TestVehicle {
  public static void main(String[] args){
    FourWheeler objFour = new FourWheeler("LA-09 CS-1046", "Volkswagen", 4, true);
    objFour.showDetails();
    objFour.accelerate(200);
  }
}
