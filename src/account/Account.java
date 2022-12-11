package account;

public class Account {
    private int id;
    private long cardNumber;
    private String name;
    private boolean blockAccount;

    public Account(int id, long cardNumber, String name, boolean blockAccount) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.name = name;
        this.blockAccount = blockAccount;
    }

}
