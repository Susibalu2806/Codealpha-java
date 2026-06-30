import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("      AI CHATBOT");
        System.out.println("===================================");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {

            System.out.print("You : ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot : Thank you! Have a nice day.");
                break;
            }

            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot : Hello! Nice to meet you.");
            }

            else if (input.contains("how are you")) {
                System.out.println("Bot : I am doing great. Thanks for asking!");
            }

            else if (input.contains("your name")) {
                System.out.println("Bot : My name is AI ChatBot.");
            }

            else if (input.contains("college")) {
                System.out.println("Bot : I can answer questions related to college.");
            }

            else if (input.contains("course")) {
                System.out.println("Bot : Our college offers various UG and PG courses.");
            }

            else if (input.contains("admission")) {
                System.out.println("Bot : Admissions are based on eligibility criteria.");
            }

            else if (input.contains("fees")) {
                System.out.println("Bot : Please visit the accounts office for fee details.");
            }

            else if (input.contains("library")) {
                System.out.println("Bot : The library is open from 8 AM to 6 PM.");
            }

            else if (input.contains("hostel")) {
                System.out.println("Bot : Hostel facilities are available for boys and girls.");
            }

            else if (input.contains("placement")) {
                System.out.println("Bot : Our placement cell provides training and placement support.");
            }

            else if (input.contains("thank")) {
                System.out.println("Bot : You're welcome!");
            }

            else if (input.contains("bye")) {
                System.out.println("Bot : Goodbye! Have a wonderful day.");
            }

            else {
                System.out.println("Bot : Sorry, I don't understand that question.");
            }

        }

        sc.close();
    }
}