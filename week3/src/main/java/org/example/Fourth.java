package org.example;

public class Fourth {

    private static double annualInterestRate;
    private double savingsBalance;

    public Fourth(double balance) {
        this.savingsBalance = balance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double calculateMonthlyInterest() {
        double interest = savingsBalance * annualInterestRate / 12;
        savingsBalance += interest;
        return savingsBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static void main(String[] args) {
        Fourth AzamatZakirovch = new Fourth(2000);
        Fourth MuxlisaYaxshilikova = new Fourth(1000);

        Fourth.setAnnualInterestRate(0.05);

        for(int month = 1; month <= 12; month++) {
            System.out.printf("Month %d:  Azamat: $%.2f | Muxlisa: $%.2f\n", month,
                    AzamatZakirovch.calculateMonthlyInterest(),
                    MuxlisaYaxshilikova.calculateMonthlyInterest());
        }
        System.out.println("\n=== Year-End Balances ===");
        System.out.printf("Azamat Zakirovch's balance: $%.2f\n", AzamatZakirovch.getSavingsBalance());
        System.out.printf("Muxlisa Yaxshilikova's balance: $%.2f\n", MuxlisaYaxshilikova.getSavingsBalance());

    }
}