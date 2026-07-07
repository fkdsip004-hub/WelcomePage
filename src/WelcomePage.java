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
        System.out.println("WELCOME TO STIX INDUSTRIES4(●'◡'●)");
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
                break;
            }
            if (pass.equals("ABCD") && name.equals("ABCD") ){
                System.out.print("Would you like to create a new acc? (Y/N): ");
                String ans = scanner.next();
                System.out.print("Create a new username: ");
                String name2 = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Create a new password: ");
                String pass2 = scanner.nextLine();
                name = name2;
                pass = pass2;
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
                    System.out.println("*LOGIN SESSION TERMINATED!*");
                    break;
                }
                else {
                    System.out.println("INCORRECT USERNAME OR PASSWORD PLEASE TRY AGAIN");
                    System.out.println("CAREFUL, YOU HAVE " + counter + " TRIAL LEFT!");
                }

            }

        }
        if (counter == 0){
            System.out.print("Would you like to create a new acc? (Y/N): ");
            String ans = scanner.next();


        }
        scanner.close();
    }
}
