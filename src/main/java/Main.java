import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("""
                Hello would select an option
                C) Check In
                B) book a room
                X) exit
                """);
        String userOption = myScanner.nextLine().toLowerCase();

        switch (userOption) {
            case "c" -> {
                checkInMenu(myScanner);
            }
            case "b" -> {
                bookRoomMenu();
            }
            case "x" -> {
                System.exit(0);
            }
            default -> System.out.println("Pick a valid option");
        }
    }

    public static void checkInMenu(Scanner methodScanner) {
        System.out.println("Enter your room:");
    }
    public static void bookRoomMenu(Scanner methodScanner) {
        System.out.println("How many nights will you be staying?: ");
        String userInput = methodScanner.nextLine();


    }
}
