import java.util.Scanner;
class C_TortioseDaygeFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long age;
        
        double yearday, dayge;

        System.out.println("Enter An Age In Years:");
        age = scan.nextInt();
        
        yearday = 365.25;

        dayge = age * yearday;

        System.out.println ( "Your Age In Days,");
        
        System.out.println ( "Also Known As The Dayge,");
        
        System.out.println ( "Is Equal To " + dayge + ".");
        
        System.out.println ( " ");
        
        System.out.println ( "This Was Accomplished By");
        
        System.out.println ( "Tortoise Mathematics.");
    }
}