package statics;

public class Test {
    public static void main(String[] args) {
        BankAccount.setRate(12);

        BankAccount bankAccount = new BankAccount();
        bankAccount.setInvestment(300);
        double amount = bankAccount.getAmount(6);
        System.out.println("Tutar1:" + amount);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setInvestment(500);
        double amount2 = bankAccount2.getAmount();
        System.out.println("Tutar2:" + amount2);

        System.out.println("Pi Sayısı:" + Math.PI);
        double sin30 = Math.sin(Math.PI/6);
        System.out.println("Sinus 30 derece : " + sin30);
    }
}
