package account;

import java.util.ArrayList;

public class Account {
    private int id;
    private long cardNumber;
    private String name;
    private boolean blockAccount;
    private BillDetails billDetails = new BillDetails();

    public Account(int id, long cardNumber, String name, boolean blockAccount) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.name = name;
        this.blockAccount = blockAccount;
    }

    public class BillDetails {
        private ArrayList<Double> withdrawals = new ArrayList<Double>(); //снятия
        private ArrayList<Double> payments = new ArrayList<Double>(); //платежи
        private ArrayList<Double> receipts = new ArrayList<Double>(); //поступления
        private double monthlyWithdrawals;
        private double monthlyPayments;
        private double monthlyReceipts;

        public void setWithdraw(double cash) {
            withdrawals.add(cash);
        }
        public void setPayment(double cash) {
            payments.add(cash);
        }
        public void setReceipt(double cash) {
            receipts.add(cash);
        }

        public void calculateMonthlyWithdrawals() {
            for(double withdrawal : withdrawals) {
                monthlyWithdrawals += withdrawal;
            }
        }
        public void calculateMonthlyPayments() {
            for(double payment : payments) {
                monthlyPayments += payment;
            }
        }
        public void calculateMonthlyReceipts() {
            for(double receipt : receipts) {
                monthlyReceipts += receipt;
            }
        }
        public double getMonthlyWithdrawals() {
            calculateMonthlyWithdrawals();
            return monthlyWithdrawals;
        }
        public double getMonthlyPayments() {
            calculateMonthlyPayments();
            return monthlyPayments;
        }
        public double getMonthlyReceipts() {
            calculateMonthlyReceipts();
            return monthlyReceipts;
        }
    }

    public void withdrawMoney(double cash) {
        billDetails.setWithdraw(cash);
    }
    public void makePayment(double cash) {
        billDetails.setPayment(cash);
    }
    public void receiptMoney(double cash) {
        billDetails.setReceipt(cash);
    }
    public String getStatistic() {
        return "withdrawals per month: " + billDetails.getMonthlyWithdrawals() + " р."
                + "\npayments per month: " + billDetails.getMonthlyPayments() + " р."
                + "\nreceipts per month: " + billDetails.getMonthlyReceipts() + " р.";
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public long getCardNumber() {
        return this.cardNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setBlockAccount(boolean blockAccount) {
        this.blockAccount = blockAccount;
    }
    public boolean getBlockAccount() {
        return this.blockAccount;
    }

    public String toString() {
        return "id: " + this.id
                + "\ncard number: " + this.cardNumber
                + "\nname: " + this.name
                + "\nblock account: " + this.blockAccount;
    }
}
