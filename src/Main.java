public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditCalc = new CreditPaymentService();

        int creditSum = 1_000_000;
        double creditPercent = 9.99;
        int creditPeriod = 12;
        int monthlyPaymentOneYear = creditCalc.calculate (creditSum, creditPercent, creditPeriod);
        System.out.println("Ежемесячный платеж при сроке кредитования 1 год: " + monthlyPaymentOneYear + " р." );


        int creditSum1 = 1_000_000;
        double creditPercent1 = 9.99;
        int creditPeriod1 = 24;
        int monthlyPaymentTwoYear = creditCalc.calculate (creditSum1, creditPercent1, creditPeriod1);
        System.out.println("Ежемесячный платеж при сроке кредитования 2 года: " + monthlyPaymentTwoYear + " р." );

        int creditSum2 = 1_000_000;
        double creditPercent2 = 9.99;
        int creditPeriod2 = 36;
        int monthlyPaymentThreeYear = creditCalc.calculate (creditSum2, creditPercent2, creditPeriod2);
        System.out.println("Ежемесячный платеж при сроке кредитования 3 года: " + monthlyPaymentThreeYear + " р." );


    }
}
