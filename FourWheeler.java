package session10;

class FourWheeler extends Vehicle {

  //Declare a field specific to child class
  private boolean powerSteer; // Variable to store steering information

  /**
   * @param vID
   * @param vName
   * @param numWeels
   * @param pSteer
   */
  public FourWheeler(String vID, String vName, int numWeels, boolean pSteer) {
    // Attributes inherited from parenrt class
    vehicleNo = vID;
    vehicleName = vName;
    wheels = numWeels;
    // Childclass own attribute
    powerSteer = pSteer;
  }

  /**
   *
   */
  public void showDetails() {
    System.out.println("Vehicleno :" + vehicleNo);
    System.out.println("VehicleName: " + vehicleName);
    System.out.println("Number of Weels" + wheels);
    if (powerSteer == true)
      System.out.println("Power Steering:Yes");
    else
      System.out.println("Power Steering:No");
  }
}



