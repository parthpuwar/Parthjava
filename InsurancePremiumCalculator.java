import java.util.*;
public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();    
        double amount = sc.nextDouble();
        int claims = sc.nextInt();
        double premium = 0;
        double processingCharge = 0;
        double discount = 0;
        if (type == 1) { 
            processingCharge = 50;
            if (amount < 100000)
                premium = amount * 0.003;
            else
                premium = amount * 0.0025;
            if (claims == 0)
                discount = 0.10;
        } else if (type == 2) {
            processingCharge = 80;
            if (amount < 250000)
                premium = amount * 0.005;
            else
                premium = amount * 0.0075;

            if (claims == 0)
                discount = 0.15;
        }
        double total = premium + processingCharge;
        double finalPremium = total - (total * discount);
        System.out.printf("%.2f", finalPremium);
        sc.close();
    }
}

