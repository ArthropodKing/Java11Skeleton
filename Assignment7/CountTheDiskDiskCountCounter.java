import java.util.Scanner;
class CountTheDiskDiskCountCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int buyscost;
            
        double totalcost;
            
        System.out.println("Enter the price of your purchase:");
            
        buyscost = scan.nextInt();
        
        if (buyscost > 1000) {
            
            totalcost = buyscost * 0.9;
               
        } else {
            
            totalcost = buyscost;
            
        }
        
        System.out.println("The discounted price is " + totalcost + " cents");
            
        System.out.println("Good-bye for now"); // always executed
    }
}