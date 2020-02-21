import java.util.Scanner;
class E_GetTheGasOrNotte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gasmax, gasleft, mpg;
        
        System.out.println("How much is ye gas capacity of thy steed, squire?:");
        gasmax = scan.nextInt();
        
        System.out.println("What percentage of gas is left in thy steed?");
        gasleft = scan.nextInt();
        
        System.out.println("How much miles per gallon doth thy steed require?");
        mpg = scan.nextInt();
        
        double gasleftwhole = gasmax * (gasleft / 100);
        
        double moveleft = mpg * gasleftwhole;
        
        System.out.println("thou hast " + moveleft + " miles before thy steed runs out of gas");
        
        if (moveleft < 200) {
            System.out.println("Thou shalt not make it: turn back now or thou wilt surely perish!");
        }
    }
}