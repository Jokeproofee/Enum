package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COMPARTMENT("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        THE_VAN("Фургон"),
        MINIVAN("Минивэн");

        private String name;

    BodyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
