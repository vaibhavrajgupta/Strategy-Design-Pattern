public class main {
    public static void main(String[] args) {
        Vehicle f1 = new SportsVehicle();
        f1.drive();
        Vehicle truck = new GoodsVehicle();
        truck.drive();
        Vehicle thar = new OffRoadVehicle();
        thar.drive();
    }
}
