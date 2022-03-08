public class BrakesTest {
    String testOk = "Brakes Test Passed";
    String testFail = "Brakes Test Failed";
    String testResult;

    public String brakesTest(int brakes, String type)  {
        if (type == "truck") {
            if (brakes > 25) {
                 testResult=testOk;
            } else {
                 testResult=testFail;
            }
        } else if (type == "car") {
            if (brakes > 20) {
                 testResult=testOk;
            } else {
                 testResult=testFail;
            }
        } else if (type == "xlTruck"){
            if (brakes>30){
                testResult=testOk;
            } else {
                testResult=testFail;
            }
        }
       return testResult;
    }

}
