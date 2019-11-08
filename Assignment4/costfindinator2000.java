public class costfindinator2000 {
    public static void main(String[] args) {
        double price = 1.47;
        int quantity = 10;
        double sum = 0;
        
        for (int i = 0; i < quantity; i++) {
            //sum = sum + price;
            sum += price;
        }
        
        System.out.println ("DA FINAL COZT ISZ " + sum);
    }
}