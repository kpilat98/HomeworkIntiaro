import org.testng.annotations.Test;

public class CarTest {
    CarModelBase car = new CarModelBase();
    EngineTest testEngine = new EngineTest();
    BrakesTest testBrakes = new BrakesTest();
    ChassisTest testChassis = new ChassisTest();
    String model;

    @Test
    public  void testFiat500(){
        model = "fiat500";
        car.vehicle(model);
        testBrakes.brakesTest(car.fiat500.brakes,car.fiat500.type);
        testEngine.engineTest(car.fiat500.fuel,car.fiat500.emission,car.fiat500.type);
        testChassis.chassisTest(car.fiat500.mass,car.fiat500.axleNumber,car.fiat500.type);
        System.out.println(model+ " " + testEngine.testResult);
        System.out.println(model+ " " + testBrakes.testResult);
        System.out.println(model+ " " + testChassis.testResult);
    }
    @Test
    public void testOpelVivaro(){
        model = "vivaro";
        car.vehicle(model);
        testBrakes.brakesTest(car.opelVivaro.brakes,car.opelVivaro.type);
        testEngine.engineTest(car.opelVivaro.fuel,car.opelVivaro.emission,car.opelVivaro.type);
        testChassis.chassisTest(car.opelVivaro.mass,car.opelVivaro.axleNumber,car.opelVivaro.type);
        System.out.println(model+ " " + testEngine.testResult);
        System.out.println(model+ " " + testBrakes.testResult);
        System.out.println(model+ " " + testChassis.testResult);
    }

    @Test
    public void testScaniaR450(){
        model="scaniaR450";
        car.vehicle(model);
        testBrakes.brakesTest(car.scaniaR450.brakes,car.scaniaR450.type);
        testEngine.engineTest(car.scaniaR450.fuel,car.scaniaR450.emission,car.scaniaR450.type);
        testChassis.chassisTest(car.scaniaR450.mass,car.scaniaR450.axleNumber,car.scaniaR450.type);
        System.out.println(model+ " " + testEngine.testResult);
        System.out.println(model+ " " + testBrakes.testResult);
        System.out.println(model+ " " + testChassis.testResult);

    }
}
