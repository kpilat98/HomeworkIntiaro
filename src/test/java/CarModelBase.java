public class CarModelBase {
    Car fiat500 = new Car();
    Car opelVivaro = new Car();
    Car scaniaR450 = new Car();

    public void vehicle(String model) {
        if (model == "fiat500") {
            fiat500.fuel = "diesel";
            fiat500.brakes = 19;
            fiat500.mass = 950;
            fiat500.axleNumber = 2;
            fiat500.emission = 30;
            fiat500.type = "car";

        } else if (model=="vivaro") {
            opelVivaro.fuel = "gasoline";
            opelVivaro.brakes = 30;
            opelVivaro.mass = 2250;
            opelVivaro.axleNumber = 2;
            opelVivaro.emission = 45;
            opelVivaro.type = "truck";

        } else if (model == "scaniaR450"){
            scaniaR450.fuel="diesel";
            scaniaR450.brakes=42;
            scaniaR450.mass=12000;
            scaniaR450.axleNumber = 4;
            scaniaR450.emission=70;
            scaniaR450.type="xlTruck";
        }
    }
}
