import java.util.Scanner;

class PROPAOKYPIEEATINCONTEST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double contestantWeight, targetWeight, minWeight, maxWeight;
        
        System.out.println("'OW MUCH D'YA WEIGH");
        
        targetWeight = 250; 
        
        //this is here so that the target weight can be changed easily if needed
        
        maxWeight = targetWeight + 30;
        
        minWeight = targetWeight - 30;
        
        contestantWeight = scan.nextInt();
        
        if ( contestantWeight>= minWeight && contestantWeight <= maxWeight) {
            System.out.println("YER IN");
        } else {
            System.out.println("YER OUT YA FILTY CHEATA!!!!!!");
        }
    }
}