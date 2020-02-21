import java.util.Scanner;
class BrickDropDistanceCalcPirate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double droptime, distance;
        
        System.out.println("How many seconds will ye drop the brick for, ye scurvy dog?:");
        droptime = scan.nextInt();
        
        distance = 0.5 * 32.17 * droptime * droptime;
        
        System.out.println("The brick'll fall " + distance + " feet, arr");
        
        System.out.println("[generic pirate dialogue]");
    }
}