public class ChassisTest {
    String testOk = "Chassis Test Passed";
    String testFail = "Chassis Test Failed";
    String testResult;

    public String chassisTest(int mass, int axleNumber, String type)  {
        float axleLoad = mass/axleNumber;
        if (type == "car") {
            if (axleLoad < 650) {
                testResult=testOk;
            } else {
                testResult=testFail;
            }
        } else if (type == "truck") {
            if (axleLoad < 1500) {
                testResult=testOk;
            } else {
                testResult=testFail;
            }
        } else if (type == "xlTruck"){
            if (axleLoad < 2500){
                testResult=testOk;
            } else {
                testResult=testFail;
            }
        }
        return testResult;
    }

}

