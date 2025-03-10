import java.util.Scanner;

public class shopping_cart{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;
        System.out.println("What item would you like to buy?\n");
        item=scanner.nextLine();

        System.out.println("What is the price for each? \n");
        price= scanner.nextDouble();

        System.out.println("How many would you like? \n");
        quantity=scanner.nextInt();

        total=quantity*price;
        System.out.println("You have bought "+quantity+" "+item);
        System.out.println("The total is "+currency+total);

        scanner.close();

    }
}