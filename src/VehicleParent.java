public class VehicleParent {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    // fuelEfficiency = (distance/litres) * 100
    public int calculateFuelEfficiency (int distance, int litres ){
        int fuel = (distance/litres)* 100;
        return fuel;
        }
    }

