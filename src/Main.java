import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Легковые автомобили:");
        Car car = new Car("Audi","A8 50 L TDI quattro",3.0, BodyType.CROSSOVER);
        Car car1 = new Car("BMW","Z8",3.0,BodyType.SEDAN);
        Car car2 = new Car("Kia","Sportage 4",2.4,BodyType.CROSSOVER);
        Car car3 = new Car("Hyundai","Avante",1.6,BodyType.SEDAN);

        System.out.println(car);
        car.printType();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car.pitStop();
        car.bestLapTime();
        car.maximumSpeed();

        System.out.println("###############################");
        System.out.println("Автобусы:");
        Bus bus = new Bus("Икарус","350",4.0, Capacity.MEDIUM);
        Bus bus1 = new Bus("Iveco","320",5.0,Capacity.LARGE);
        Bus bus2 = new Bus("Fiat","399",3.5,Capacity.LARGE);
        Bus bus3 = new Bus("Hyundai","Н350",4.8,Capacity.ESPECIALLY_LARGE);

        System.out.println(bus);
        bus.printType();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        System.out.println("###############################");
        System.out.println("Грузовые автомобили:");
        Trucks trucks = new Trucks ("Mercedes-Benz","B-901" , 6.6,LoadCapacity.N1);
        Trucks trucks1 = new Trucks("Nissan", "399", 6.2,LoadCapacity.N2);
        Trucks trucks2 = new Trucks("Chevrolet","M700", 7.5,LoadCapacity.N3);
        Trucks trucks3 = new Trucks("Scania","T540", 8.7,LoadCapacity.N1);

        System.out.println(trucks);
        trucks.printType();
        System.out.println(trucks1);
        System.out.println(trucks2);
        System.out.println(trucks3);

    }
}