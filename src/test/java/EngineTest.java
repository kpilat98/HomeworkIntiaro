public class EngineTest {
    String testOk ="Engine Test Passed";
    String testFail ="Engine Test Failed";
    String testResult;
    int carType;
    public String engineTest(String fuel, float emission, String type) {
        if (fuel=="diesel"){
            carType=0;
        }else if(fuel=="gasoline"){
            carType=2;
        }
        if (type=="car"){
            carType=carType+1;
        } else if(type == "truck"){
            carType=carType+2;
        } else if (type =="xlTruck"){
            carType=carType+5;
        }

        switch (carType){
            case 1:
                if (emission <= 30) {
                    testResult=testOk;
                } else {
                    testResult=testFail;
                }
                break;
            case 2:
                if (emission <= 35) {
                    testResult=testOk;
                } else {
                    testResult=testFail;
                }
                break;
            case 3:
                if (emission <= 25) {
                    testResult=testOk;
                } else {
                    testResult=testFail;
                }
                break;

            case 4:
                if (emission <= 40) {
                    testResult=testOk;
                } else {
                    testResult=testFail;
                }
                break;
            case 5:
                if (emission<=70){
                    testResult=testOk;
                }else {
                    testResult=testFail;
                }
                break;
            case 7:
                if (emission<=55){
                    testResult=testOk;
                }else{
                    testResult=testFail;
                }
                break;
        }
        return testResult;
    }
}

