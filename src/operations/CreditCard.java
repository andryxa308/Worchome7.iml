package operations;

public class CreditCard {
    public int money = 0;
    public CreditCard (int money) {
        this.money = money;
    }
    public void add (int amount) {
        money += amount;
        System.out.println("Остаток на счету " + money);

    }
    public void withdraw (int amount) {
        money -= amount;
        System.out.println("Остаток на счету " + money);
    }
    public int check() {
        System.out.println(money);
        return money;
    }
}