package ApıAutomation;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class SumValidation {
    @Test
    public void sumOfCourses(){



        JsonPath js = new JsonPath(Body.coursePrice());

        int count=   js.getInt("courses.size()");
        int totalAmount=js.getInt("dashboard.purchaseAmount ");
        System.out.println(totalAmount);
        int total=0;
        for (int i = 0; i <count ; i++) {
            int p=js.getInt("courses["+i+"].price");
            int copy=js.getInt("courses["+i+"].copies");

            total+=(p*copy);
        }

        if (total==totalAmount)
            System.out.println("yes mathces");
        else
            System.out.println("no wrong");

    }
}
