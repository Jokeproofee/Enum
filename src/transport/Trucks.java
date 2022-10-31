package transport;

public class Trucks extends Transport implements Competing {

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовой автомобиль закончил движение");
    }

    @Override
    public double pitStop() {
        System.out.println("Пит-стоп");
        return 0;
    }

    @Override
    public double bestLapTime() {
        System.out.println("Лучший круг");
        return 0;
    }

    @Override
    public int maximumSpeed() {
        System.out.println("Максимальная скорость");
        return 0;
    }

    @Override
    public void printType() {
        if(loadCapacity == null) {
            System.out.println("Данных по авто недостаточно.");
        }else {
            System.out.println("Грузоподъемность авто: от " + loadCapacity.getFrom() + " до " + loadCapacity.getTo() + " Тонн.");
        }
    }

    @Override
    public String toString() {
        return "{Брэнд: " + getBrand() +
                " / Модель: " + getModel() +
                " / Объем двигателя: " + getEngineVolume() + " литра}";
    }
}