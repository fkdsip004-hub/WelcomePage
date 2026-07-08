import java.util.Date;
import java.util.Scanner;

public class WelcomePage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int counter = 5;
        String password = "Ndabile101";
        String userName = "Konke.Ndabile";
        userName = userName.trim();
        password = password.trim();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("WELCOME TO STIX INDUSTRIES4(●'◡'●)❤️");
        System.out.println("LOGIN");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();


        while (true){

            System.out.print("Enter UserName (Type ABCD if you're not registered.): ");
            String name = scanner.nextLine();
            name = name.trim();
            System.out.print("Enter Password (Type ABCD if you're not registered.): ");
            String pass = scanner.nextLine();
            pass = pass.trim();

            if (pass.equals(password) && userName.equals(name) ){
                System.out.println("WELCOME! " + name);
                Date now = new Date();
                System.out.println("You logged in at " + now);
                counter = 5;
                break;
            }
            else if (pass.equals("ABCD") && name.equals("ABCD") ){
                System.out.print("Would you like to create a new acc? (Y/N): ");
                String ans = scanner.nextLine();
                ans = ans.toUpperCase();

                if (ans.equals("Y")) {
                    System.out.print("Create a new username: ");
                    userName = scanner.nextLine();
                    System.out.print("Create a new password: ");
                    password = scanner.nextLine();
                    System.out.println("Your user name is: " + userName + " and your password is: " + password);
                    counter = 5;

                }
                else
                    break;
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

        scanner.close();
    }
}
