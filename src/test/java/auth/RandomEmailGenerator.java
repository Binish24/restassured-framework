package auth;

import config.ConfigLoader;

public class RandomEmailGenerator {

    /* Create a method which will generate random emails.
     *some email should not be generated twice ( duplicate email )
     * domain of the email should not be set by the user
     * for instance, the email should end with @TekSchool.com / @java.com
     */
//    public static String generateRandomEmails() {
//        int randomNumber = (int) (Math.random() * 100000);
//        return "dev" + randomNumber + "@naraiman.com";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(generateRandomEmails());
//    }

    public static String generateRandomEmail() {
        String domain = ConfigLoader.getProperty("email.domain");
        return "test" + System.currentTimeMillis() + "@" + domain;
    }

    /* testCURRENTDATETIME@ domain */

    public static void main (String [] args) throws InterruptedException {
        // System.out.println(generateRandomEmail());

        for ( int i = 1; i <=10; i ++) {
            System.out.println( i + " " + generateRandomEmail());
            Thread.sleep(200);
        }
    }

}