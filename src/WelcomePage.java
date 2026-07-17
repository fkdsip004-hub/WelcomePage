import java.util.Date;
import java.util.Scanner;

public class WelcomePage {

    static Scanner scanner = new Scanner(System.in);

    static void intro() {
        System.out.println("---------------------------------------------------------");
        System.out.println("WELCOME TO STIX INDUSTRIES4(●'◡'●)");
        System.out.println("LOGIN");
        System.out.println("Type ABCD(For password & username) to registerer.");
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }

    static void main(String[] args){

        //testing pushing w the terminal.
        int counter = 5;
        String password = "Ndabile101";
        String userName = "Konke.Ndabile";
        userName = userName.trim();
        password = password.trim();

        intro();

        while (true){
            System.out.println("*************************");
            System.out.print("Enter UserName: ");
            String userNameAttempt = scanner.nextLine();
            userNameAttempt = userNameAttempt.trim();
            System.out.print("Enter Password: ");
            String passwowrdAttempt = scanner.nextLine();
            passwowrdAttempt = passwowrdAttempt.trim();
            System.out.println("*************************");
            if (passwowrdAttempt.equals(password) && userName.equals(userNameAttempt) ){
                System.out.println("WELCOME! " + userNameAttempt);
                Date now = new Date();
                System.out.println("You logged in at " + now);
                counter = 5;
                break;
            }
            else if (passwowrdAttempt.equalsIgnoreCase("ABCD") && userNameAttempt.equalsIgnoreCase("ABCD") ){
                System.out.print("Would you like to create a new acc? (Y/N): ");
                String ans = scanner.nextLine();
                ans = ans.toUpperCase();
                ans = ans.trim();

                if (ans.equals("Y")) {
                    String[] newCredentials = getCredentials();
                    password = newCredentials[1];
                    userName = newCredentials[0];
                    intro();
                    counter = 5;


                }
                else {
                    System.out.println("GoodBye!");
                    break;
                }
            }
            else{
                counter --;

                if (counter > 1) {
                    System.out.println("INCORRECT USERNAME OR PASSWORD PLEASE TRY AGAIN.");
                    System.out.println("YOU HAVE " + counter + " TRIALS LEFT!");
                }
                else if (counter == 0) {
                    System.out.println("INCORRECT USERNAME OR PASSWORD.");
                    System.out.println("*YOU HAVE " + counter + " TRIALS LEFT*");
                    System.out.println("*LOGIN SESSION TERMINATED! Ncese, lol*");
                    break;
                }
                else {
                    System.out.println("INCORRECT USERNAME OR PASSWORD PLEASE TRY AGAIN");
                    System.out.println("CAREFUL, YOU HAVE " + counter + " TRIAL LEFT!!!");
                }

            }

        }


    }


    static String[] getCredentials() {
        String[] credentials = new String[2];
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine();

        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        credentials[0] = newUsername;
        credentials[1] = newPassword;


        return credentials;


    }
}
