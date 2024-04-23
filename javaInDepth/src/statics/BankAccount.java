package statics;

public class BankAccount {
    private double investment;
    private static double rate;
    public final static int MONTH_COUNT=12;
    public double getAmount(int month){
        return investment * (1+ month*rate/100);
    }

    public double getAmount(){
        return getAmount(MONTH_COUNT);
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }
}
 