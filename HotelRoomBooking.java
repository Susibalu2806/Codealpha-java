import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> roomNumbers = new ArrayList<>();
        ArrayList<String> roomCategories = new ArrayList<>();
        ArrayList<Double> roomPrices = new ArrayList<>();
        ArrayList<Boolean> roomBooked = new ArrayList<>();

        // Room Data
        roomNumbers.add(101);
        roomCategories.add("Standard");
        roomPrices.add(1500.0);
        roomBooked.add(false);

        roomNumbers.add(201);
        roomCategories.add("Deluxe");
        roomPrices.add(2500.0);
        roomBooked.add(false);

        roomNumbers.add(301);
        roomCategories.add("Suite");
        roomPrices.add(4000.0);
        roomBooked.add(false);

        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Search Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Booking Details");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");

                    for (int i = 0; i < roomNumbers.size(); i++) {
                        if (!roomBooked.get(i)) {
                            System.out.println(
                                "Room No: " + roomNumbers.get(i) +
                                " | Category: " + roomCategories.get(i) +
                                " | Price: ₹" + roomPrices.get(i)
                            );
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int bookRoom = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < roomNumbers.size(); i++) {

                        if (roomNumbers.get(i) == bookRoom && !roomBooked.get(i)) {

                            roomBooked.set(i, true);

                            System.out.println("Payment Successful!");
                            System.out.println("Amount Paid: ₹" + roomPrices.get(i));
                            System.out.println("Room Booked Successfully!");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Room Not Available!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Room Number to Cancel: ");
                    int cancelRoom = sc.nextInt();

                    boolean cancelled = false;

                    for (int i = 0; i < roomNumbers.size(); i++) {

                        if (roomNumbers.get(i) == cancelRoom && roomBooked.get(i)) {

                            roomBooked.set(i, false);

                            System.out.println("Reservation Cancelled!");

                            cancelled = true;
                            break;
                        }
                    }

                    if (!cancelled) {
                        System.out.println("Booking Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("\nBooked Rooms:");

                    for (int i = 0; i < roomNumbers.size(); i++) {

                        if (roomBooked.get(i)) {

                            System.out.println(
                                "Room No: " + roomNumbers.get(i) +
                                " | Category: " + roomCategories.get(i) +
                                " | Price: ₹" + roomPrices.get(i)
                            );
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}