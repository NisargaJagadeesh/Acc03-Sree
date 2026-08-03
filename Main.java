package com.tnsif.driver;

import java.util.Scanner;
import com.tnsif.assignment1.TicketBooking;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] data = input.split(",");

        TicketBooking ticket = new TicketBooking(
                data[0],
                data[1],
                Integer.parseInt(data[2]));

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {

        case 1:
            Double amount = Double.parseDouble(sc.nextLine());
            ticket.makePayment(amount);
            break;

        case 2:
            Double walletAmount = Double.parseDouble(sc.nextLine());
            String walletNumber = sc.nextLine();
            ticket.makePayment(walletNumber, walletAmount);
            break;

        case 3:
            String holderName = sc.nextLine();
            Double cardAmount = Double.parseDouble(sc.nextLine());
            String creditCard = sc.nextLine();
            String ccv = sc.nextLine();
            ticket.makePayment(creditCard, ccv, holderName, cardAmount);
            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}