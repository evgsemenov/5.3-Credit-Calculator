public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditCalc = new CreditPaymentService();

        int creditSum = 1_000_000;
        double creditPercent = 9.99;
        int creditTime = 12;
        int monthlyPaymentOneYear = creditCalc.calculate (creditSum, creditPercent, creditTime);
        System.out.println("Ежемесячный платеж: " + monthlyPaymentOneYear + " р." );

//
//        int creditSum = 1_000_000;
//        double creditPercent = 9.99;
//        int creditTime = 24;
//        int monthlyPaymentTwoYear = creditCalc.calculate (creditSum, creditPercent, creditTime);
//        System.out.println("Ежемесячный платеж: " + monthlyPaymentTwoYear + " р." );
//
//        int creditSum = 1_000_000;
//        double creditPercent = 9.99;
//        int creditTime = 36;
//        int monthlyPaymentThreeYear = creditCalc.calculate (creditSum, creditPercent, creditTime);
//        System.out.println("Ежемесячный платеж: " + monthlyPaymentThreeYear + " р." );


    }
}
