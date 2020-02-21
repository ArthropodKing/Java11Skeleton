import java.util.Scanner;
class F_AnimalComparinator20000000yo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String person, feature, animal;

        System.out.println("Enter a Person:");
        person = scan.nextLine();
        
        System.out.println("Enter a Feature:");
        feature = scan.nextLine();
        
        System.out.println("Enter an Animal:");
        animal = scan.nextLine();

        System.out.println ( person + " has a " + feature + " like that of a  " + animal);
    }
}