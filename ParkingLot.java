public class ParkingLot {
    ParkingSpot[] spots;
    public ParkingLot(){
        this.spots = new ParkingSpot[8];
        this.spots[0] = new ParkingSpot(true,null);
        this.spots[1] = new ParkingSpot(true,null);
        this.spots[2] = new ParkingSpot(false,null);
        this.spots[3] = new ParkingSpot(false,null);
        this.spots[4] = new ParkingSpot(false,null);
        this.spots[5] = new ParkingSpot(false,null);
        this.spots[6] = new ParkingSpot(false,null);
        this.spots[7] = new ParkingSpot(false,null);
    }
    public int park(Car Car1, ParkingLot Pl1){
        for (int i = 0; i < Pl1.spots.length; i++){
        if (Pl1.spots[i].parkedCar == null){
            if (Pl1.spots[i].hacc){
                if (Car1.hcap){
                    Pl1.spots[i].parkedCar = Car1;
                    return i;
                    }
                }
                else{
                Pl1.spots[i].parkedCar = Car1;
                return i;}
            }
        }
    return -1;}

    public Car checkSpot(int spot, ParkingLot Pl1){
        Car temp = Pl1.spots[spot].parkedCar;
        Pl1.spots[spot].parkedCar = null;
    return temp;}

    public String toString(ParkingLot Pl1){
        int havail = 0;
        int ravail = 0;
        for (int i = 0; i < Pl1.spots.length; i++){
            if (Pl1.spots[i].parkedCar == null){
                if (Pl1.spots[i].hacc == true){
                    havail++;
                }
                else{
                    ravail++;
                }
            }
        }
    return havail + " " + ravail;}
}
