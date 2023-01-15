package DataFromExel;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException {
        DataDriven d=new DataDriven();
      ArrayList<String>list= d.getData("Purchase");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
