import java.util.Scanner;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager(2, 1, 1);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Entry or Exit");
            System.out.println("1. Entry");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2), or 0 to exit: ");
            int moveChoice = scanner.nextInt();
            scanner.nextLine();

            if (moveChoice == 0) {
                break;
            }


            if(moveChoice == 1){
                System.out.println("Select vehicle type:");
                System.out.println("1. Hatchback");
                System.out.println("2. SUV");
                System.out.print("Enter your choice (1 or 2), or 0 to exit: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    break;
                }

                System.out.print("Enter car number: ");
                String carNumber = scanner.nextLine();

                Vehicle vehicle;
                if (choice == 1) {
                    vehicle = new Hatchback(carNumber);
                } else if (choice == 2) {
                    vehicle = new Suv(carNumber);
                } else {
                    System.out.println("Invalid choice!");
                    continue;
                }

                parkingManager.newCarEntry(vehicle);
            } else if(moveChoice == 2){
                System.out.print("Enter car number: ");
                String carNumber = scanner.nextLine();
                parkingManager.carExit(carNumber);
            }
        }

        scanner.close();
        parkingManager.getCurrentStatus();
    }
}