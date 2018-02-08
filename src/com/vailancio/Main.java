package com.vailancio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter you first and last name: ");
        String firstname = reader.next();
        String lastname = reader.next();

        User user = new User(firstname,lastname);
        user.displayUserDetails();

        System.out.println("Chose type of card: ");
        System.out.println("1: Platinum Card ");
        System.out.println("2: Elite Card ");

        Card card;

        int option = reader.nextInt();

        switch(option){
            case 1:
                 card = CardFactory.getCard("Platinum");
                break;
            case 2:
                card = CardFactory.getCard("Elite");
                break;
            default:
                throw new Error("Invalid option");
        }

        CardOperation cc = new CardOperation(card);
        cc.setCustomer(user);

        System.out.println("Your card details ");
        cc.displayDetails();


        while(true){
            System.out.println("What would you like to do ? ");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Change Credit Limit");
            System.out.println("4. Set Lock Code");
            System.out.println("5. Quit");

            option = reader.nextInt();

            float amount;

            switch(option){
                case 1:
                    System.out.println("Enter the amount to be credited");
                    amount = reader.nextFloat();

                    try{
                        cc.credit(amount);
                        cc.displayDetails();
                    }catch(Error e){
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Try again");
                        break;
                    }

                    break;
                case 2:
                    System.out.println("Enter the amount to be debited");
                    amount = reader.nextFloat();

                    try{
                        cc.debit(amount);
                        cc.displayDetails();
                    }catch(Error e){
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Try again");
                        break;
                    }

                    break;
                case 3:
                    System.out.println("Enter new credit limit");
                    int a = reader.nextInt();


                    try{
                        cc.setCreditLimit(a);
                        cc.displayDetails();
                    }catch(Error e){
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Try again");
                        break;
                    }

                case 4:

                    System.out.println("Type your lock code");
                    String code = reader.next();


                    try{
                        cc.setLockCode(code);
                        System.out.println("Lock Code set for your card "+card.getNumber());
                    }catch(Error e){
                        System.out.println(e.getMessage());
                        System.out.println("Invalid input. Try again");
                        break;
                    }
                case 5:
                    return;
                default:
                    throw new Error("Invalid option");
            }
        }

    }
}
