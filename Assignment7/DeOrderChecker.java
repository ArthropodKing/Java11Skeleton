import java.util.Scanner;
class DeOrderChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int boltnum, nutnum, washnum, totalcost;
        
        final int boltprice = 5;
        
        final int nutprice = 3;
        
        final int washprice = 1;
        
        System.out.println(" how many BOLTS?");
        
        boltnum = scan.nextInt();
        
        System.out.println("Enter an integer:");
        
        nutnum = scan.nextInt();
        
        System.out.println("Enter an integer:");
        
        washnum = scan.nextInt();
        if (boltnum < nutnum) {
            System.out.println("your order is BAD there are too many NUTS relative to BOLTS");        
        }
        
        if (washnum * 2 < boltnum) {
            System.out.println("your order is BAD there are too many WASHERS relative to BOLTS"); 
        }
        
        totalcost = boltprice + nutprice + washprice;
        System.out.println("your total cost is " + totalcost + " CENTS");
    }
}