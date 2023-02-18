package ApıAutomation;

import io.restassured.path.json.JsonPath;

public class ComplexJsonPath {

    public static void main(String[] args) {


        JsonPath js = new JsonPath(Body.coursePrice());
    //print number of courses

      int count=   js.getInt("courses.size()");
        System.out.println(count);

    //print purchase amount

        int totalAmount=js.getInt("dashboard.purchaseAmount ");
        System.out.println(totalAmount);

        //print title of first course

        String courseTitle=js.getString("courses[0].title");
        System.out.println(courseTitle);

     // print all course name
        for (int i = 0; i <count ; i++) {

          String t=  js.get("courses["+i+"].title");
            System.out.println(t);
            int p= js.getInt("courses["+i+"].price");
            System.out.println(p);
        }

        //print number of copiesa sold in RPA

        for (int i = 0; i <count ; i++) {
            String t= js.getString("courses["+i+"].title");
          if (t.equalsIgnoreCase("rpa")){
              int copy=js.getInt("courses["+i+"].copies");
              System.out.println(copy);
              break;
          }
        }

         //verify if sum of all course prices matches with purchase amount
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