package base;

import config.ConfigLoader;

import java.util.Properties;

public class FirstConfigTestExam {
    /*
     * 1: Load the entire properties from the config and print them into the console
     * 2: Load the switch value from the config file
     * 3: store and print the value. (switch).
     */

    public static void main(String[] args) {


        // configLoader is name of class and getProperties is name of the method!!!!!
        System.out.println(ConfigLoader.getProperties());

        System.out.println("- - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -");

        Properties properties = ConfigLoader.getProperties();

        System.out.println(properties);

        System.out.println("- - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -");

        System.out.println( ConfigLoader.getProperty("test.execute"));

        System.out.println("- - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -");

        String executeTest = ConfigLoader.getProperty("test.execute");
        System.out.println(executeTest);


        System.out.println("- - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -");

//        boolean testExecute = Boolean.parseBoolean(ConfigLoader.getProperty("test.execute"));
//        System.out.println(testExecute);

        // this one is a type of boolean


        //boolean is name of DataType, testExecute is name of variable, confiqLoader is name of the class and getBooleanProperty is
        // name of method and "test.execute" is name of the properties ...
//        boolean testExecute = ConfigLoader.getBooleanProperty("test.execute");
//        System.out.println(testExecute);


        System.out.println(ConfigLoader.getBooleanProperty("test.execute"));
        System.out.println(ConfigLoader.getIntProperty("timeouts"));

        System.out.println("- - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -  - - - - - - -");

    }
}