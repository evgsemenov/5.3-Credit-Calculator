public class CreditPaymentService {
    public int calculate(int creditSum, double creditPercent, int creditPeriod) {
        double monthlyPercent = creditPercent / 100 / 12;
        int powValue = creditPeriod;
        double expo = Math.pow((monthlyPercent + 1), powValue);
        int monthlyPayment = (int) (creditSum * (creditPercent / 100 / 12 * expo) / (expo - 1));


        return monthlyPayment;
    }


}
