package program;

import clase.*;

public class Main {
    public static void main(String[] args) {

        LoanHandler creditCheck = new CreditScoreHandler();
        LoanHandler incomeCheck = new IncomeHandler();
        LoanHandler employmentCheck = new EmploymentHandler();

        Bank bank = new Bank(creditCheck, incomeCheck, employmentCheck);

        LoanApplication app1 = new LoanApplication("Ion Popescu", 700, 30000, true);
        LoanApplication app2 = new LoanApplication("Maria Ionescu", 600, 40000, true);
        LoanApplication app3 = new LoanApplication("Andrei Georgescu", 750, 20000, true);
        LoanApplication app4 = new LoanApplication("Elena Vasilescu", 800, 50000, false);

        System.out.println("Aprobare app1: " + bank.processLoan(app1)); // true
        System.out.println("Aprobare app2: " + bank.processLoan(app2)); // false
        System.out.println("Aprobare app3: " + bank.processLoan(app3)); // false
        System.out.println("Aprobare app4: " + bank.processLoan(app4)); // false
    }
}
