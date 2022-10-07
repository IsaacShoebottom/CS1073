/**
 @author Isaac Shoebottom (3429069)
 **/
public class CarDriver {
    public static void main(String[] args){
        driveCars();
    }

    private static void driveCars(){
        Car car1 = new Car("2020 Honda Civic LX Automatic", 7.1);
        Car car2 = new Car("2020 Ford F-150 XLT Automatic", 10.7);

        car1.addGas(46.9);
        car2.addGas(87.0);

        car1.driveCar(172.8);
        car2.driveCar(106.88);

        System.out.println("car1:" +
                            "\n    Model: " + car1.getModel() +
                            "\n    Fuel Efficiency: " + car1.getFuelEfficiency() + " L/100km" +
                            "\n    Gas Left: " + car1.getTankVolume() + " L");

        System.out.println("car2:" +
                            "\n    Model: " + car2.getModel() +
                            "\n    Fuel Efficiency: " + car2.getFuelEfficiency() + " L/100km" +
                            "\n    Gas Left: " + car2.getTankVolume() + " L");
    }
}
