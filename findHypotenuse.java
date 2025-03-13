import java.util.Scanner;

public class findHypotenuse{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter length of side a: ");
        a= scanner.nextDouble();
        System.out.print("Enter length of side b: ");
        b= scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("The length of third side is "+c);


        scanner.close();
    }
}