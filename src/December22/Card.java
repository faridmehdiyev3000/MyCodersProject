package December22;

public class Card {
    public String folderName;
    public String cardNumber;
    public int expertalDate;
    public Integer cvv;
    public Double balance ;
    public Integer userId;

    public Card(String folderName, String cardNumber, int expertalDate, Integer cvv, Double balance, Integer userId) {
        this.folderName = folderName;
        this.cardNumber = cardNumber;
        this.expertalDate = expertalDate;
        this.cvv = cvv;
        this.balance = balance;
        this.userId = userId;
    }
}
