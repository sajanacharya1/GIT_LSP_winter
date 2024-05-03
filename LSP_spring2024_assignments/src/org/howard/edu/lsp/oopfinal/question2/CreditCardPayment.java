package org.howard.edu.lsp.oopfinal.question2;

public class CreditCardPayment implements PaymentStrategy {
    private String CardNumber;

    public CreditCardPayment(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid" + " " + amount + " using credit card " + CardNumber);
    }
}