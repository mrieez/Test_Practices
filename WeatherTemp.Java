import java.util.Scanner;

public class WeatherTemp {
    public static void main(String[] args) {

        Scanner askedUser = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Meepo's Weather-Based Temp: Java Program");
        System.out.println("----------------------------------------");

        System.out.print("First time using? (y/n): ");
        String user = askedUser.nextLine();

        if (user.equalsIgnoreCase("y")) {
            System.out.println("----------------------------------------");
            System.out.print("Username: ");
            String username = askedUser.nextLine();

            System.out.print("City: ");
            String city = askedUser.nextLine();

            System.out.println("----------------------------------------");

            welcome(username);

        } else if (user.equalsIgnoreCase("n")) {
            System.out.println("----------------------------------------");
            System.out.println("Please input your information");
            System.out.print("Username: ");
            String userName = askedUser.nextLine();

            System.out.print("City: ");
            String yourCity = askedUser.nextLine();

            System.out.println("----------------------------------------");

            welcomeBack(userName);

        } else {
            System.out.println("Please retry and use single letter.");
        }

        System.out.println("\n" + "Please select options below: ");
        System.out.println("[1] Home");
        System.out.println("[2] Help");
        System.out.print("Option: ");
        int option = askedUser.nextInt();

        if (option == 1) {
            System.out.print("1 + 1 = ");
            int answer01 = askedUser.nextInt();
        } else if (option == 2) {
            System.out.print("11 + 11 = ");
            int answer02 = askedUser.nextInt();
        } else {
            System.out.println("Please only input 1 or 2.");
        }

    }
        public static void welcome (String username){

        System.out.println("Welcome, new user " + username);
        }

        public static void welcomeBack (String userName){
            System.out.println("Welcome back, user " + userName);
        }
    }
