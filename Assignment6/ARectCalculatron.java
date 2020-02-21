import java.util.Scanner;

class ARectCalculatron {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        long area, width, height;

        System.out.println("Enter an height:");
        height = scan.nextInt();

        System.out.println("Enter a width:");
        width = scan.nextInt();
        
        area = width * height;

        System.out.println ( "Forsooth! the area doth be " + area);
    }
}