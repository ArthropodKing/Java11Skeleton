import java.util.Scanner;

class BPricefinder2000 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        long area, width, height;
        double price;

        System.out.println("Enter an height:");
        height = scan.nextInt();

        System.out.println("Enter a width:");
        width = scan.nextInt();
        
        System.out.println("Enter the paint price:");
        price = scan.nextDouble();
        
        area = width * height;

        System.out.println ( "beep boop the total cost is " + area * price);
    }
}