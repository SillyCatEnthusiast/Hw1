public class ParkingLot {
    ParkingSpot[] spots;
    ParkingLot(){
        spots = new ParkingSpot[8];
        spots[0] = new ParkingSpot(true,null);
        spots[1] = new ParkingSpot(true,null);
        spots[2] = new ParkingSpot(false,null);
        spots[3] = new ParkingSpot(false,null);
        spots[4] = new ParkingSpot(false,null);
        spots[5] = new ParkingSpot(false,null);
        spots[6] = new ParkingSpot(false,null);
        spots[7] = new ParkingSpot(false,null);
    }
    int park(Car Car){
        for (int i = 0; i < spots.length; i++)
        if (spots[i].parkedCar != null){
            if (spots[i].hacc){
                if (Car.hcap){
                    spots[i].parkedCar = Car;
                    System.out.printf("%d", i);
                    }
                }
        }
    return 1;
        }
}
