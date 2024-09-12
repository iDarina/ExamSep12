package exam;

import java.util.Random;
import java.util.Scanner;

public class exam {

    //Q2.1
    public static void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    //Q2.2
    public static double getPrice(){
        Random random = new Random();
        return random.nextInt(11) + 5;
    }

    //Q2.3
    public static void printSizes(char[] sizes){
        for(int i = 0; i <= sizes.length; i++){
            System.out.println(sizes[i]);
        }

    }

    //Q2.4
    public static void printOrder(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Burger-Joint! Is it true or false that your order will be to go?");
        boolean toGoOrNot = scanner.nextBoolean();

        System.out.println("What type of burger do you want today? Cheese, ham or turkey?");
        String typeOfBurger = scanner.nextLine();

        System.out.println("Please enter a tip of 0%, 5%, 10%, 15% or 20% tip!");
        int tip = scanner.nextInt();

        System.out.println("What is the name for your order?");
        String nameForOrder = scanner.nextLine();

        double basePrice = getPrice();
        double totalTip = basePrice * (tip / 100.0);
        double totalPrice = basePrice + totalTip;

        System.out.println("Order summary:");
        System.out.println("To go: " + toGoOrNot);
        System.out.println(typeOfBurger);
        System.out.println(tip);
        System.out.println(nameForOrder);
        System.out.println("Total price would be: " + totalPrice);
    }

    //Q3.1
//    public static double priceAfterDiscount(double[] productPrices, int discountAmount){
//        double totalPrice;
//        for(double price = 0; price <= productPrices.length; price++){
//            totalPrice += price;
//        }
//        return totalPrice;
//    }


    //Q4
    public static void rollDice(){
        Random random = new Random();
        double num1 = random.nextInt(6) + 1;
        double num2 = random.nextInt(6) + 1;
        System.out.println(num1 + " , " + num2);
    }

    //Q5
    public static void isPalindrome(){
        Scanner scanner = new Scanner(System.in);



        while(true){
            System.out.println("Enter correct word");
            String answer = scanner.nextLine();

            if(answer.equals("Palindrome")){
            System.out.println("The word you entered is a Palindrone");
            break;
            }else{
           System.out.println("Try again");
       }
        }

    }

    public static void main(String[] args) {

        //Q1.1
        String firstName = "Daryna"; String lastName = "Hurtova";

        //Q1.2
        char[] sizes = {'S', 'M', 'L'};

        //Q1.3
        final double EXPIRATION_DATE = 18.04;


        //Q2.1
        //printFullName(firstName, lastName);

        //Q2.2
        //System.out.println(getPrice());

        //Q2.3
        //printSizes(sizes);

        //Q2.4
        //printOrder();

        //Q4
        //rollDice();

        //Q5
        isPalindrome();
    }
}
