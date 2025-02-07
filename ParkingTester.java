public class ParkingTester {
    public static void main(String[] args){
        
        ParkingLot Pl1 = new ParkingLot();
        System.out.printf("%s\n", Pl1.toString(Pl1));
        Car car1 = new Car(true, "Infiniti", "Blue");
        Pl1.park(car1, Pl1);
        System.out.printf("%s\n", Pl1.toString(Pl1));
        Car car2 = new Car(false, "Cadillac", "Black");
        Pl1.park(car2, Pl1);
        System.out.printf("%s\n", Pl1.toString(Pl1));
        Pl1.checkSpot(0, Pl1);
        System.out.printf("%s", Pl1.toString(Pl1));

        
    }
}
