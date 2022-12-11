import account.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(115418, 1245634532, "Robin Hanson", false);
        Account account1 = new Account(126489, 1248537732, "Amanda Robles", true);

        account.receiptMoney(100);
        account.makePayment(54.6);
        account.receiptMoney(11.2);
        System.out.println(account.getStatistic());
    }
}
