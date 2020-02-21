import java.util.Scanner;

class FantasyGame{
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int str, hlt, lck;
       final int maxpoints = 15;
       
       String name;
        
       System.out.println("Welcome to Gastropod Adventures character creator!");
       
       System.out.println("Enter character name:");
       name = scan.nextLine();
       
       System.out.println("Remember: you may not have more than 15 total ability scores");
       
       System.out.println("Enter Strength (1-10):");
       str = scan.nextInt();
       
       System.out.println("Enter Health (1-10):");
       hlt = scan.nextInt();
       
       System.out.println("Enter Luck (1-10):");
       lck = scan.nextInt();
       
       int totalpoints = str + hlt + lck;
       
       if (totalpoints > maxpoints) {
           System.out.println("too many points, default values assigned");
           str = 5;
           hlt = 5;
           lck = 5;
        }
       
       System.out.println("Name = " + name + ", strengh = " + str + ", health = " + hlt + ", luck = " + lck);
       
       System.out.println("set out on your adventure?");
       System.out.println("[YES] [YES]");
    }
}