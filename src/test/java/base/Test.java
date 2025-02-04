package base;

import config.ConfigLoader;

public class Test {


    public static void main(String[] args) {

        System.out.println(ConfigLoader.getProperties());
        System.out.println(ConfigLoader.getProperty("test.suite"));
        System.out.println(ConfigLoader.getIntProperty("timeouts"));

        int timeouts = ConfigLoader.getIntProperty("timeouts");
        System.out.println(timeouts);
        System.out.println(timeouts + 10);

        //this print the code as a String but we don't need it!
//           String timeouts = ConfigLoader.getProperty("timeouts");
//            System.out.println(timeouts + 10);

//            // This one is going to print the code as integer and this one is the correct and the right one!
//            int timeouts = ConfigLoader.getIntProperty("timeouts");
//            System.out.println(timeouts + 10);

    }
}