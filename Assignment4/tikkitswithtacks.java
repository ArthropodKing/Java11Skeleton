public class tikkitswithtacks {
    public static void main(String[] args) {
        double ticketcost = 23.5;
        double ticketpoundsign = 8;
        double tickettax = 0.12;
        
        double finalcost = (ticketcost + tickettax) * ticketpoundsign;
        double taxpaid = tickettax * ticketpoundsign;
        
        System.out.println("total cost = $"+ finalcost);
        System.out.println("tax paid = $"+ taxpaid);
    }
}