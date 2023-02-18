package ApıAutomation;

public class Body {

    public static String bodyTag(){
        String s="{\"location\": {   \"lat\": -38.383494,   \"lng\": 33.427362  },\n" +
                "\n" +
                "\n" +
                "\n" +
                " \"accuracy\": 50,  \"name\": \"Frontline house\",  \n" +
                " \"phone_number\": \"(+91) 983 893 3937\",  \n" +
                " \"address\": \"29, side layout, cohen 09\",\n" +
                "   \"types\": [    \"shoe park\",    \"shop\"  ],\n" +
                " \"website\": \"http://google.com\",  \n" +
                " \"language\": \"French-IN\"\n";

   return s;

    }

public static String coursePrice(){
        return "{\n" +
                "\n" +
                "\"dashboard\": {\n" +
                "\n" +
                "\"purchaseAmount\": 910,\n" +
                "\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "\n" +
                "},\n" +
                "\n" +
                "\"courses\": [\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\n" +
                "\"price\": 50,\n" +
                "\n" +
                "\"copies\": 6\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Cypress\",\n" +
                "\n" +
                "\"price\": 40,\n" +
                "\n" +
                "\"copies\": 4\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"RPA\",\n" +
                "\n" +
                "\"price\": 45,\n" +
                "\n" +
                "\"copies\": 10\n" +
                "\n" +
                "}\n" +
                "\n" +
                "]\n" +
                "\n" +
                "}";
}

public static  String AddBook(String isbn,String aisle){

String s="{\n" +
        "\n" +
        "\"name\":\"O YEAH YEAH YEAH LOY LOY LOY \",\n" +
        "\"isbn\":\""+isbn+"\",\n" +
        "\"aisle\":\""+aisle+"\",\n" +
        "\"author\":\"Abdullah VESEK\"\n" +
        "}\n";
return s;


}

}
