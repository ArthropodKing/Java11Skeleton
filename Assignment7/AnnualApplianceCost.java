import java.util.Scanner;
class AnnualApplianceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int houryear;
        double costhour, costyear;
        
        System.out.println("Enter cost per kilowatt-hour in cents:");
        costhour = scan.nextInt();
        
        System.out.println("Enter kilowatt-hours used per year:");
        houryear = scan.nextInt();
        
        costyear = costhour + houryear;
        
        System.out.println("Annual cost: " + costyear + " cents"); // always executed
    }
}