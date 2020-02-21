import java.util.Scanner;
class GroundBeefValueCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int LeanPerPackageA, LeanPerPackageB;
        double PricePerPoundA, PricePerPoundB, PricePerPoundLeanA, PricePerPoundLeanB;
        
        System.out.println("Enter Price Per Pound For Package A:");
        PricePerPoundA = scan.nextInt();
        
        System.out.println("Enter Percent Lean For Package A:");
        LeanPerPackageA = scan.nextInt();
        
        System.out.println("Enter Price Per Pound For Package B:");
        PricePerPoundB = scan.nextInt();
        
        System.out.println("Enter Percent Lean For Package B:");
        LeanPerPackageB = scan.nextInt();
        
        PricePerPoundLeanA = (LeanPerPackageA / 100) * PricePerPoundA;
        
        PricePerPoundLeanB = (LeanPerPackageB / 100) * PricePerPoundB;
        
        if (PricePerPoundLeanA > PricePerPoundLeanB) {
           System.out.println("A Is Better");
        } else if (PricePerPoundLeanA < PricePerPoundLeanB) {
            System.out.println("B Is Better");
        } else {
            System.out.println("Both Are The Same");
        }
    }
}