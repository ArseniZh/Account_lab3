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

}
