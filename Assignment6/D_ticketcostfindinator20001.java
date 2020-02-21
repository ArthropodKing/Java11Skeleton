import java.util.Scanner;
class D_ticketcostfindinator20001 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long price, quantity, totalcost;

        System.out.println("How may moneys does a ticket cost?");
        price = scan.nextInt();

        System.out.println("How many tickets do you want?:");
        quantity = scan.nextInt();
       
        totalcost = price * quantity;

        System.out.println ( "Your tickets will cost " + totalcost + " moneys in total.");
    }
}