package P8_ParkingSystem;

public class Main {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(5);

        lot.parkVehicle("ABC-123");
        lot.parkVehicle("XYZ-999");
        lot.parkVehicle("LMN-456");

        lot.displayStatus();

        lot.exitVehicle("XYZ-999");

        lot.displayStatus();
    }
}