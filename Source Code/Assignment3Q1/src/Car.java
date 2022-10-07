/**
 This class represents a car.
 @author Isaac Shoebottom (3429069)
*/
public class Car {

  /**
   The model of the car (e.g. "Hyundai Accent").
  */
    private final String model;



  /**
   The fuel efficiency of the car (in liters/100 km).
  */
    private final double fuelEfficiency;



  /**
   The amount of gas in the tank (in liters).
  */
    private double tankFilledVolume;



  /**
   This method constructs a car with the specified model and fuel efficiency. 
   The gas tank is initially empty.
   @param modelIn the model of the car.
   @param fuelEfficiencyIn the fuel efficiency of the car (in liters/100 km).
  */
    public Car(String modelIn, double fuelEfficiencyIn){
        this.model = modelIn;
        this.fuelEfficiency = fuelEfficiencyIn;
        this.tankFilledVolume = 0;
    }



  /**
   This method retrieves the model of the car.
   @return the model of the car.
  */
    public String getModel(){
        return model;
    }



  /**
   This method retrieves the fuel efficiency of the car.
   @return the fuel efficiency of the car (in liters/100 km).
  */
    public double getFuelEfficiency(){
        return fuelEfficiency;
    }



  /**
   This method retrieves the amount of gas in the tank.
   @return the amount of gas in the tank (in litres).
  */
    public double getTankVolume(){
        return tankFilledVolume;
    }



  /**
   This method drives the car for a certain distance, reducing the gas in the tank. 
   You may assume that the car will never consume more than the available gas 
   (you do NOT need to include a check for this in your solution).
   @param distance the distance driven (in km).
  */
    public void driveCar(double distance){
        tankFilledVolume = tankFilledVolume - ((distance/100) * fuelEfficiency);
    }



  /**
   This method adds gas to the tank.
   @param gasAdded the volume of gas added to the tank (in liters).
  */
    public void addGas(double gasAdded){
        tankFilledVolume =+ gasAdded;
    }



} //end Car
